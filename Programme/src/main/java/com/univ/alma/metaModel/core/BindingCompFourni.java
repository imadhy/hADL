package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;

/**
 * Created by imadhy on 03/12/15.
 */
public class BindingCompFourni {
    private PortComposantSimpleFourni PortCompSimpFourni_comp1;
    private PortComposantSimpleFourni PortCompSimpFourni_comp2;

    public BindingCompFourni(PortComposantSimpleFourni PCSF1, PortComposantSimpleFourni PCSF2) {
        this.PortCompSimpFourni_comp1 = PCSF1;
        this.PortCompSimpFourni_comp2 = PCSF2;

        System.out.println("Binding entre " + this.PortCompSimpFourni_comp1.getNom() + " ===> " + this.PortCompSimpFourni_comp2.getNom());
    }

    public PortComposantSimpleFourni getPortCompSimpFourni_comp1() {
        return this.PortCompSimpFourni_comp1;
    }

    public PortComposantSimpleFourni getPortCompSimpFourni_comp2() {
        return this.PortCompSimpFourni_comp2;
    }
}
