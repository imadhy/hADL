package com.univ.alma.model.connecteur;


import com.univ.alma.metaModel.connecteurSimple.ConnecteurSimple;

public class RPC extends ConnecteurSimple{
	private RoleEnvoiClient roleEnvoiClient;
	private RoleEnvoiServeur roleEnvoiServeur;
	private RoleReceptionClient roleReceptionClient;
	private RoleReceptionServeur roleReceptionServeur;
	
	public RPC(String nom) {
		super(nom);
		
		this.roleEnvoiClient = new RoleEnvoiClient("RoleEnvoiClient");
		this.roleEnvoiServeur = new RoleEnvoiServeur("RoleEnvoiServeur");
		this.roleReceptionClient = new RoleReceptionClient("RoleReceptionClient");
		this.roleReceptionServeur = new RoleReceptionServeur("RoleReceptionServeur");
		
		//this.addInterfaceConnecteurSimple(roleEnvoiClient);
		//this.addInterfaceConnecteurSimple(roleEnvoiServeur);
		//this.addInterfaceConnecteurSimple(roleReceptionClient);
		//this.addInterfaceConnecteurSimple(roleReceptionServeur);
		
	}

	public RoleEnvoiClient getRoleEnvoiClient() {
		return roleEnvoiClient;
	}

	public RoleEnvoiServeur getRoleEnvoiServeur() {
		return roleEnvoiServeur;
	}

	public RoleReceptionClient getRoleReceptionClient() {
		return roleReceptionClient;
	}

	public RoleReceptionServeur getRoleReceptionServeur() {
		return roleReceptionServeur;
	}
	
	


}
