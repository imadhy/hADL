package com.univ.alma.model.connecteur;

import com.univ.alma.metaModel.connecteurSimple.RoleRequis;

public class RoleEnvoiServeur extends RoleRequis{
	
	public RoleEnvoiServeur(String nom) {
		super(nom);
	}
	
	public void receive(Object object) {
		if (this.countObservers() == 0) {
			System.out.println("#### " + this.getClass().getSimpleName() + " ### Aucun attachement");
		}
		this.setChanged();
		this.notifyObservers(object);
	}


}
