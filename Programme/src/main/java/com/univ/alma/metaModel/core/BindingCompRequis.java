package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;

/**
 * Created by imadhy on 03/12/15.
 */
public class BindingCompRequis {
    private PortComposantSimpleRequis PortCompSimpRequis_comp1;
    private PortComposantSimpleRequis PortCompSimpRequis_comp2;

    public BindingCompRequis(PortComposantSimpleRequis PCSR1, PortComposantSimpleRequis PCSR2) {
        this.PortCompSimpRequis_comp1 = PCSR1;
        this.PortCompSimpRequis_comp2 = PCSR2;

        System.out.println("Binding entre " + this.PortCompSimpRequis_comp1.getNom() + " ===> " + this.PortCompSimpRequis_comp2.getNom());
    }

    public PortComposantSimpleRequis getPortCompSimpRequis_comp1() {
        return this.PortCompSimpRequis_comp1;
    }

    public PortComposantSimpleRequis getPortCompSimpRequis_comp2() {
        return this.PortCompSimpRequis_comp2;
    }

}
