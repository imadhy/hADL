package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;
import com.univ.alma.metaModel.configuration.PortConfigurationRequis;

import java.util.Observable;

/**
 * Created by imadhy on 03/12/15.
 */
public class BindingRequis extends Binding {
    public BindingRequis(PortConfigurationRequis portSource, PortConfigurationRequis portConfiguration){
        super(portSource, portConfiguration);
        portConfiguration.addObserver(this);
    }

    public BindingRequis(PortComposantSimpleRequis portSource, PortConfigurationRequis portConfiguration){
        super(portSource, portConfiguration);
        portSource.addObserver(this);
    }

    public void update(Observable obs, Object message) {
        System.out.println("\nupdate | BindingRequis: " + this.getClass().getSimpleName() + " | message = " + message);
        super.getPortConfiguration().send(message);
    }

    public PortConfigurationRequis getPortConfiguration(){
        return (PortConfigurationRequis) super.getPortConfiguration();
    }
}