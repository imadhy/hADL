package com.univ.alma.metaModel.connecteur;

public abstract class Connecteur {
	
	protected String nom;
	
	protected abstract void glue();

	public String getNom() {
		return this.nom;
	}
}
