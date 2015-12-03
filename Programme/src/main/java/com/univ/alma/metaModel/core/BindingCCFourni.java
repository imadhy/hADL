package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.configuration.PortConfigurationFourni;
import com.univ.alma.metaModel.configuration.PortConfigurationRequis;

/**
 * Created by imadhy on 03/12/15.
 */

public class BindingCCFourni {
    private PortConfigurationFourni PortCongifFourni;
    private PortComposantSimpleFourni PortCompSimpFourni;

    public BindingCCFourni(PortConfigurationFourni PCF, PortComposantSimpleFourni PCSF) {
        this.PortCongifFourni = PCF;
        this.PortCompSimpFourni = PCSF;

        System.out.println("Binding entre " + this.PortCompSimpFourni.getNom() + " ===> " + this.PortCongifFourni.getNom());
    }

    public PortConfigurationFourni getPortConfigurationFourni() {
        return this.PortCongifFourni;
    }

    public PortComposantSimpleFourni getPortCompSimpFourni() {
        return this.PortCompSimpFourni;
    }
}