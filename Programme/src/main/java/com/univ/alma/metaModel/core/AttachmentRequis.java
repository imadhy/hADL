package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;
import com.univ.alma.metaModel.configuration.PortConfigurationRequis;
import com.univ.alma.metaModel.connecteurSimple.RoleFourni;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by imadhy on 03/12/15.
 */

public  class AttachmentRequis extends Attachment {
    public AttachmentRequis(PortComposantSimpleRequis portRequis, RoleFourni roleFourni) {
        super(portRequis, roleFourni);
        portRequis.addObserver(this);
    }

    public AttachmentRequis(PortConfigurationRequis portRequis, RoleFourni roleFourni) {
        super(portRequis, roleFourni);
        portRequis.addObserver(this);
    }

    public void update(Observable obs, Object message) {
        System.out.println("\nUpdate | AttachementRequis: " + this.getClass().getSimpleName() + " | message = " + message);
        super.role.send(message);
    }
}