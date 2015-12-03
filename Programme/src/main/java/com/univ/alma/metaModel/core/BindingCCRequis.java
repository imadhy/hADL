package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;
import com.univ.alma.metaModel.configuration.PortConfigurationRequis;

/**
 * Created by imadhy on 03/12/15.
 */
public class BindingCCRequis {
    private PortConfigurationRequis PortCongifRequis;
    private PortComposantSimpleRequis PortCompSimpRequis;

    public BindingCCRequis(PortConfigurationRequis PCR, PortComposantSimpleRequis PCSR) {
        this.PortCongifRequis = PCR;
        this.PortCompSimpRequis = PCSR;

        System.out.println("Binding entre " + this.PortCompSimpRequis.getNom() + " ===> " + this.PortCongifRequis.getNom());
    }

    public PortConfigurationRequis getPortConfigurationRequis() {
        return this.PortCongifRequis;
    }

    public PortComposantSimpleRequis getPortCompSimpRequis() {
        return this.PortCompSimpRequis;
    }
}