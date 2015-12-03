package com.univ.alma.metaModel.composantSimple;

public class PortComposantSimpleRequis extends PortComposantSimple {

	private ServiceComposantSimpleRequis serviceCSR;

	public PortComposantSimpleRequis(String nom, ServiceComposantSimpleRequis service) {
		this.nom = nom;
        this.serviceCSR = service;
		System.out.println("Port Composant Simple Requis " + nom);
	}
}
