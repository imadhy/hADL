package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.connecteurSimple.RoleFourni;

import java.util.Observer;

/**
 * Created by imadhy on 03/12/15.
 */
public abstract class AttachmentFournis implements Observer {
    private PortComposantSimpleFourni portComSimpFourni;
    private RoleFourni roleFourni;

    public AttachmentFournis(PortComposantSimpleFourni PCSF, RoleFourni RF) {
        this.portComSimpFourni = PCSF;
        this.roleFourni = RF;

        System.out.println("Attachment entre " + this.portComSimpFourni.getNom() + " ===> " + this.roleFourni.getNom());
    }

    public PortComposantSimpleFourni getPortComSimpFourni() {
        return this.portComSimpFourni;
    }

    public RoleFourni getRoleFourni() {
        return this.roleFourni;
    }
}
