package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;
import com.univ.alma.metaModel.connecteurSimple.RoleRequis;

import java.util.Observer;

/**
 * Created by imadhy on 03/12/15.
 */
public abstract class AttachmentRequis implements Observer {
    private PortComposantSimpleRequis portComSimpRequis;
    private RoleRequis roleRequis;

    public AttachmentRequis(PortComposantSimpleRequis PCSR, RoleRequis RR) {
        this.portComSimpRequis = PCSR;
        this.roleRequis = RR;

        System.out.println("Attachment entre " + this.portComSimpRequis.getNom() + " ===> " + this.roleRequis.getNom());
    }

    public PortComposantSimpleRequis getPortComSimpRequis() {
        return this.portComSimpRequis;
    }

    public RoleRequis getRoleRequis() {
        return this.roleRequis;
    }
}
