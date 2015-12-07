package com.univ.alma.model.connecteur;

import java.util.Observable;

import com.univ.alma.metaModel.connecteurSimple.RoleFourni;

public class RoleReceptionServeur extends RoleFourni{
	
	public RoleReceptionServeur(String nom) {
		super(nom);
	}
	
	public void update(Observable o, Object object) {
		if (this.countObservers() == 0) {
			System.out.println("#### " + this.getClass().getSimpleName() + " ### Aucun attachement");
		}
		this.setChanged();
		this.notifyObservers(object);
	}

	

}