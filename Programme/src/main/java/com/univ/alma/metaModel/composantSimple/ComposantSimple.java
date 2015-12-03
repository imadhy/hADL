package com.univ.alma.metaModel.composantSimple;

import java.util.ArrayList;

import com.univ.alma.metaModel.composant.Composant;

public class ComposantSimple extends Composant {
	
	protected ArrayList<InterfaceComposantSimple> listeInterfaceComposantSimple;
	
	public ComposantSimple(String nom) {
		this.nom = nom;
		this.listeInterfaceComposantSimple = new ArrayList<InterfaceComposantSimple>();
		
		System.out.println("Creation du Composant Simple " + nom);
	}
	
	public void addInterfaceComposantSimple(InterfaceComposantSimple ics) {
		if(!this.listeInterfaceComposantSimple.contains(ics))
			this.listeInterfaceComposantSimple.add(ics);
	}
	
	public InterfaceComposantSimple getInterfaceComposantSimple(String nom) {
		InterfaceComposantSimple returnedICS = null;
		for(InterfaceComposantSimple ics : this.listeInterfaceComposantSimple) {
			if(ics.getNom().equals(nom)) {
				returnedICS = ics;
				break;
			}
		}
		return returnedICS;
	}
}
