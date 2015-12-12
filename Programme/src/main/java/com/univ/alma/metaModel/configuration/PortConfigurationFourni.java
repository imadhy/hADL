package com.univ.alma.metaModel.configuration;

public class PortConfigurationFourni extends PortConfiguration {

	public void send(Object message){
		System.out.println("\nSend | PortConfigurationFourni: " + this.getClass().getSimpleName() + " | message = " + message);
		this.setChanged();
		this.notifyObservers(message);
	}
}
