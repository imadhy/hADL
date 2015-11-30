package com.univ.alma.metaModel.core;

import java.util.Observable;

public class Interface extends Observable {
	
	public enum InterfaceType {
		FOURNI,
		REQUIS
	}
	
	protected InterfaceType type;
	protected String nom;
	
	public InterfaceType getType() {
		return this.type;
	}
	
	public void setType(InterfaceType type) {
		this.type = type;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
}
