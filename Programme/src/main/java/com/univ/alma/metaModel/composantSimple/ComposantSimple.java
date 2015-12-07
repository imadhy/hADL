package com.univ.alma.metaModel.composantSimple;

import java.util.ArrayList;

import com.univ.alma.metaModel.composant.Composant;

public class ComposantSimple extends Composant {

	public ComposantSimple(String nom) {
		this.nom = nom;

		System.out.println("Creation du Composant Simple " + nom);
	}

}
