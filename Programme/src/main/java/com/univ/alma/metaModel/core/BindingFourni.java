package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.configuration.PortConfigurationFourni;
import com.univ.alma.metaModel.configuration.PortConfigurationRequis;

import java.util.Observable;

/**
 * Created by imadhy on 03/12/15.
 */

public class BindingFourni extends Binding {
    public BindingFourni(PortConfigurationFourni portSource, PortConfigurationFourni portConfiguration){
        super(portSource, portConfiguration);
        portSource.addObserver(this);
    }

    public BindingFourni(PortComposantSimpleFourni portSource, PortConfigurationFourni portConfiguration){
        super(portSource, portConfiguration);
        portConfiguration.addObserver(this);
    }

    public void update(Observable obs, Object message) {
        System.out.println("\nupdate | BindingFourni: " + this.getClass().getSimpleName() + " | message = " + message);
        super.getPortSource().send(message);
    }

    public PortConfigurationFourni getPortConfiguration(){
        return (PortConfigurationFourni)super.getPortConfiguration();
    }
}