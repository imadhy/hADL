package com.univ.alma.metaModel.composantSimple;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;
import com.univ.alma.metaModel.core.Interface;

import java.util.ArrayList;
import java.util.List;

public abstract class InterfaceComposantSimple extends Interface {

    private List<ServiceComposantSimple> listeServiceComposantSimple;
    private List<PortComposantSimple> listePortComposantSimple;

    public InterfaceComposantSimple () {
        listePortComposantSimple = new ArrayList<PortComposantSimple>();
        listeServiceComposantSimple = new ArrayList<ServiceComposantSimple>();

        System.out.println("Creation Interface Composant Simple " + this.nom);
    }

    public void addServiceComposantSimple(ServiceComposantSimple SCS) {
        listeServiceComposantSimple.add(SCS);
    }

    public ServiceComposantSimple getServiceComposantSimple(String nom) {
        for(int i = 0;i<listeServiceComposantSimple.size();i++) {
            if(this.listeServiceComposantSimple.get(i).getNom().equalsIgnoreCase(nom))
                return listeServiceComposantSimple.get(i);
        }
        return null;
    }

    public void addPortComposantSimple(PortComposantSimple SCS) {
        listePortComposantSimple.add(SCS);
    }

    public PortComposantSimple getPortComposantSimple(String nom) {
        for(int i = 0;i<listePortComposantSimple.size();i++) {
            if(this.listePortComposantSimple.get(i).getNom().equalsIgnoreCase(nom))
                return listePortComposantSimple.get(i);
        }
        return null;
    }
}
