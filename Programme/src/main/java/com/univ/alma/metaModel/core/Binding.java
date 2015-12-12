package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.configuration.PortConfiguration;

import java.util.Observer;

/**
 * Created by imadhy on 12/12/15.
 */
public abstract class Binding implements Observer {
    private PortConfiguration portConfiguration;
    private PortComposantSimple portSource;

    public Binding(PortComposantSimple portSource, PortConfiguration portConfiguration){
        this.portConfiguration = portConfiguration;
        this.portSource = portSource;
    }

    public PortComposantSimple getPortSource(){
        return this.portSource;
    }

    public PortConfiguration getPortConfiguration() {
        return portConfiguration;
    }
}
