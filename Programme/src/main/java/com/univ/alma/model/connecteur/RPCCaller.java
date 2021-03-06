package com.univ.alma.model.connecteur;

import com.univ.alma.metaModel.connecteurSimple.RoleFourni;
import com.univ.alma.metaModel.connecteurSimple.RoleRequis;

public class RPCCaller extends RoleFourni{
	
	public RPCCaller(String nom) {
		super(nom);
	}
	
	public void receive(Object object){
		if (this.countObservers() == 0) {
			System.out.println("#### " + this.getClass().getSimpleName() + " ### Aucun attachement");
		}
		this.setChanged();
		this.notifyObservers(object);

	}
	

}
