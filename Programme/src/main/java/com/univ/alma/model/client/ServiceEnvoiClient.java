package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;

/**
 * Created by imadhy on 03/12/15.
 */
public class ServiceEnvoiClient extends ServiceComposantSimpleFourni{

    private PortEnvoieClient portEnvoieClient;

    public ServiceEnvoiClient(String nom) {
        super(nom);
        String portNom = nom.replace("Service", "Port");

        this.portEnvoieClient = new PortEnvoieClient(portNom, this);
        this.addPortCompSimpFourni(portEnvoieClient);
    }

    public PortEnvoieClient getPortEnvoieClient() {
        return this.portEnvoieClient;
    }

    public void sendMessage(Object objet) {
        this.portEnvoieClient.send(objet);
    }
}
