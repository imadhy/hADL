package com.univ.alma.model.connecteur;


import com.univ.alma.metaModel.connecteurSimple.ConnecteurSimple;

public class RPC extends ConnecteurSimple{
	private RPCCaller RPCCaller;
	private RPCCalled RPCCalled;
	
	public RPC(String nom) {
		super(nom);
		
		this.RPCCaller = new RPCCaller("RPCCaller");
		this.RPCCalled = new RPCCalled("RPCCalled");

		this.addRole(this.RPCCaller);
		this.addRole(this.RPCCalled);
		
	}

	public RPCCaller getRPCCaller() {
		return RPCCaller;
	}

	public RPCCalled getRPCCalled() {
		return RPCCalled;
	}
}
