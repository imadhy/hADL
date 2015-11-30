package com.univ.alma.metaModel.composantSimple;

public abstract class PortComposantSimple {
	
	public enum PortType {
		SYNCHRONE,
		CONTINU,
		ASYNCHRONE
	}
	
	protected PortType type;
	protected String nom;
	
	public PortType getType() {
		return this.type;
	}
	
	public void setType(PortType type) {
		this.type = type;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
}
