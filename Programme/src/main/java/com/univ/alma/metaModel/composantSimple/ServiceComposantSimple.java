package com.univ.alma.metaModel.composantSimple;

public class ServiceComposantSimple {

    private String nom;

    public ServiceComposantSimple () {
        System.out.println("Creation Service " + this.nom);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
