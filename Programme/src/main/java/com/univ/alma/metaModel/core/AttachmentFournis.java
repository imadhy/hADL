package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.configuration.PortConfigurationFourni;
import com.univ.alma.metaModel.connecteurSimple.RoleFourni;
import com.univ.alma.metaModel.connecteurSimple.RoleRequis;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by imadhy on 03/12/15.
 */
public class AttachmentFournis extends Attachment {

    public AttachmentFournis(PortComposantSimpleFourni portFourni, RoleRequis roleRequis) {
        super(portFourni, roleRequis);
        roleRequis.addObserver(this);
    }

    public AttachmentFournis(PortConfigurationFourni portFourni, RoleRequis roleRequis) {
        super(portFourni, roleRequis);
        roleRequis.addObserver(this);
    }

    public void update(Observable obs, Object message) {
        System.out.println("\nUpdate | AttachementFourni: " + this.getClass().getSimpleName() + " | message = " + message);
        super.port.send(message);
    }
}
