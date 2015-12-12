package com.univ.alma.metaModel.composantSimple;

public class PortComposantSimpleRequis extends PortComposantSimple {

	public void send(Object message){
		System.out.println("Send | PortComposantSimpleRequis: " + this.getClass().getSimpleName() + " | message = " + message);

		this.setChanged();
		this.notifyObservers(message);
	}
}
