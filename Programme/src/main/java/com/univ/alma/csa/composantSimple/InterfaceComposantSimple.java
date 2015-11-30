package com.univ.alma.csa.composantSimple;

public abstract class InterfaceComposantSimple {
	
	public enum InterfaceType {
		FOURNI,
		REQUIS
	}
	
	private InterfaceType type;
	
	public InterfaceType getType() {
		return this.type;
	}
	
	public void setType(InterfaceType type) {
		this.type = type;
	}
}
