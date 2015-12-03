package com.univ.alma.metaModel.composantSimple;

public class PortComposantSimpleFourni extends PortComposantSimple {

	private ServiceComposantSimpleFourni serviceCSF;

	public PortComposantSimpleFourni(String nom, ServiceComposantSimpleFourni service) {
		this.nom = nom;
		this.serviceCSF = service;
		System.out.println("Port Composant Simple Fourni " + nom);
	}
	
}
