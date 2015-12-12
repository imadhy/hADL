package com.univ.alma.metaModel.configuration;

public class PortConfigurationRequis extends PortConfiguration {

	public void send(Object message){
		System.out.println("\nSend | PortConfigurationRequis: " + this.getClass().getSimpleName() + " | message = " + message);
		this.setChanged();
		this.notifyObservers(message);
	}
}
