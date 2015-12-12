package com.univ.alma.metaModel.configuration;

import java.util.*;

import com.univ.alma.metaModel.composant.Composant;
import com.univ.alma.metaModel.composantSimple.*;
import com.univ.alma.metaModel.connecteur.Connecteur;
import com.univ.alma.metaModel.core.*;


public class Configuration extends ComposantSimple implements Observer {

    private static final String CONNECTEUR_COMPOSANTS_KEY = "composants";
    private static final String CONNECTEUR_ATTACHEMENTS_F_KEY = "attachementsF";
    private static final String CONNECTEUR_ATTACHEMENTS_R_KEY = "attachementsR";

    private List<Composant> composants;

    private List<PortConfigurationFourni> portsConfigurationFournis;
    private List<PortConfigurationRequis> portsConfigurationRequis;

    private Map<Connecteur, Map<String, Object>> connecteurs;

    private List<BindingFourni> bindingsFournis;
    private List<BindingRequis> bindingsRequis;

    public Configuration(){
        this.composants = new ArrayList<Composant>();

        this.portsConfigurationFournis = new ArrayList<PortConfigurationFourni>();
        this.portsConfigurationRequis = new ArrayList<PortConfigurationRequis>();

        this.connecteurs = new HashMap<>();

        this.bindingsFournis = new ArrayList<BindingFourni>();
        this.bindingsRequis = new ArrayList<BindingRequis>();
    }

    public void addComposant(ComposantSimple composant){
        this.composants.add(composant);
        composant.addObserver(this);
    }

    public void addPortFourni(PortConfigurationFourni portConfigurationF){
        this.portsConfigurationFournis.add(portConfigurationF);
    }

    public void addPortRequis(PortConfigurationRequis portConfigurationR){
        this.portsConfigurationRequis.add(portConfigurationR);
    }

    public boolean addConnecteur(Composant composantA, Composant composantB,
                                 Connecteur connecteur, Set<AttachmentFournis> attachementsF, Set<AttachmentRequis> attachementsR)
    {

        if(attachementsF.size() != attachementsR.size()){
            return false;
        }

        if(!this.composants.containsAll(Arrays.asList(composantA, composantB))){
            return false;
        }

        Set<Composant> composants = new HashSet<>();
        composants.add(composantA);
        composants.add(composantB);

        Map<String, Object> connecteurConfig = new HashMap<>();
        connecteurConfig.put(this.CONNECTEUR_COMPOSANTS_KEY, composants);
        connecteurConfig.put(this.CONNECTEUR_ATTACHEMENTS_F_KEY, attachementsF);
        connecteurConfig.put(this.CONNECTEUR_ATTACHEMENTS_R_KEY, attachementsR);

        this.connecteurs.put(connecteur, connecteurConfig);

        return true;
    }

    public boolean addBinding(BindingFourni binding){
        if(!this.portsConfigurationFournis.contains(binding.getPortConfiguration())){
            return false;
        }

        this.bindingsFournis.add(binding);

        return true;
    }

    public boolean addBinding(BindingRequis binding){
        if(!this.portsConfigurationRequis.contains(binding.getPortConfiguration())){
            return false;
        }

        this.bindingsRequis.add(binding);

        return true;
    }

    public List<ServiceComposantSimpleFourni> getServicesFournis(){
        List<ServiceComposantSimpleFourni> servicesFournis = new ArrayList<>();

        for(Composant composant : this.composants){
            servicesFournis.addAll(composant.getServicesFournis());
        }

        return servicesFournis;
    }

    public void appelerService(Composant source, Message message) {

        PortComposantSimple port = (PortComposantSimple) message.getServiceSource().getPortsRequis().toArray()[0];
        port.send(message);
    }
    public void appelerService(ComposantSimple source, ServiceComposantSimpleRequis serviceRequis, ServiceComposantSimpleFourni serviceFourni, Object args){
        System.out.println("\nCall Service | Configuration: " + this.getClass().getSimpleName() + " | message = " + args);

        Message message = new Message(args, serviceRequis, serviceFourni);
        appelerService(source, message);
    }

    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) arg;

        System.out.println("[Configuration: " + this.getClass().getSimpleName() + ", Méthode:  update] message = " + message);

        ComposantSimple composant = (ComposantSimple) o;
        ComposantSimple composantCible = null;

        // Composant du service ciblé
        for (Composant composantAbstrait : this.composants) {
            if (composantAbstrait.getServicesFournis().contains(message.getServiceCible())) {
                composantCible = (ComposantSimple) composantAbstrait;
            }
        }

        ServiceComposantSimpleRequis serviceReq = null;
        ServiceComposantSimpleFourni serviceFou = null;

        Iterator it = this.connecteurs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            Map<String, Object> composantProperties = (Map<String, Object>) pair.getValue();
            List<Composant> composantsAb = (List<Composant>) composantProperties.get(CONNECTEUR_COMPOSANTS_KEY);

            if (composantsAb.containsAll(Arrays.asList(composant, composantCible))) {

                // Attachement Requis
                List<AttachmentRequis> attachementRequisT = (List<AttachmentRequis>) composantProperties.get(CONNECTEUR_ATTACHEMENTS_R_KEY);
                AttachmentRequis attachementR = null;

                for(AttachmentRequis attachement : attachementRequisT){
                    if(message.getStatut() == Message.StatutMessage.SUIVRE && composant.searchPort(attachement.getPort())){
                        attachementR = attachement;
                    }
                    else if(message.getStatut() == Message.StatutMessage.REPONSE && composantCible.searchPort(attachement.getPort())){
                        attachementR = attachement;
                    }
                }

                serviceReq = composant.searchServiceRequis(attachementR.getPort());

                // Attachement Fourni
                if(message.getStatut() == Message.StatutMessage.SUIVRE){
                    serviceFou = message.getServiceCible();
                }
                else {
                    List<AttachmentFournis> attachementFourniT = (List<AttachmentFournis>) composantProperties.get(CONNECTEUR_ATTACHEMENTS_F_KEY);
                    AttachmentFournis attachementF = null;

                    for (AttachmentFournis attachement : attachementFourniT) {
                        if (composant.searchPort(attachement.getPort())) {
                            attachementF = attachement;
                        }
                    }

                    serviceFou = composant.searchServiceFourni(attachementF.getPort());
                }

            }
        }

        Message response = new Message(message.getMessage(), serviceReq, serviceFou);
        if(message.getStatut() == Message.StatutMessage.REPONSE) {
            response.repondre();
        }

        this.appelerService(composant, response);
    }

}
