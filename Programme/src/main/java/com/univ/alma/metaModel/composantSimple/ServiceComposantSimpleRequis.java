package com.univ.alma.metaModel.composantSimple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imadhy on 03/12/15.
 */
public class ServiceComposantSimpleRequis extends ServiceComposantSimple {
    List<PortComposantSimpleRequis> listePortRequis;

    public ServiceComposantSimpleRequis(String nom) {
        this.nom = nom;
        this.listePortRequis = new ArrayList<PortComposantSimpleRequis>();

        System.out.println("Creation Service Composant Simple Requis : " + this.nom);
    }

    public void addPortCompSimpRequis(PortComposantSimpleRequis PCSR) {
        this.listePortRequis.add(PCSR);
    }

    public PortComposantSimpleRequis getPortCompSimpRequis(String nom) {
        for (int i = 0;i<listePortRequis.size();i++) {
            if(this.listePortRequis.get(i).getNom().equalsIgnoreCase(nom))
                return listePortRequis.get(i);
        }
        return null;
    }
}
