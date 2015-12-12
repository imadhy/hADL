package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.connecteurSimple.Role;

import java.util.Observer;

/**
 * Created by imadhy on 12/12/15.
 */
public abstract class Attachment implements Observer {

    protected PortComposantSimple port;
    protected Role role;

    public Attachment(PortComposantSimple port, Role role){
        this.port = port;
        this.role = role;
    }

    public PortComposantSimple getPort() {
        return port;
    }
}
