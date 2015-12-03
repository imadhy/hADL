package com.univ.alma.metaModel.configuration;

public class PortConfigurationRequis {
	
	private String nom;
	
	public PortConfigurationRequis(String nom) {
	
		this.nom = nom;
		System.out.println("Prot Configuration Requis " + nom);
	}

	public String getNom() {
		return this.nom;
	}
}
