package com.univ.alma.metaModel.composantSimple;

import java.util.Observable;

public class ServiceComposantSimple extends Observable {

    protected String nom;

    public ServiceComposantSimple (String nomService) {
        this.nom = nomService;
        System.out.println("Creation Service Composant Simple" + nom);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
