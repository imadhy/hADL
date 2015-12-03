package com.univ.alma.metaModel.connecteurSimple;

public abstract class Role {

	protected String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }
}
