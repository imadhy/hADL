package com.univ.alma.metaModel.configuration;

public class PortConfigurationFourni {
	
	private String nom;
	
	public PortConfigurationFourni(String nom) {
	
		this.nom = nom;
		System.out.println("Prot Configuration Fourni " + nom);
	}

	public String getNom() {
		return this.nom;
	}

}
