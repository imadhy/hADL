package com.univ.alma.metaModel.connecteurSimple;

import java.util.Observable;

public abstract class Role  extends Observable{

	protected String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }
}
