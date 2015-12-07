package com.univ.alma.metaModel.composant;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;

import java.util.ArrayList;

public class Composant {
	
	protected String nom;
    protected ArrayList<InterfaceComposantSimple> listeInterfaceComposantSimple;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

    public Composant() {
        this.listeInterfaceComposantSimple = new ArrayList<InterfaceComposantSimple>();

        System.out.println("Creation du Composant " + this.nom);
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
