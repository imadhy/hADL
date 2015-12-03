package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;

/**
 * Created by imadhy on 03/12/15.
 */
public class PortEnvoieClient extends PortComposantSimpleFourni {

    public PortEnvoieClient(String name, ServiceComposantSimpleFourni service) {
        super(name, service);
    }

    public void send(Object objet) {
        if(this.countObservers() == 0)
            System.out.println("#### " + this.getClass().getSimpleName() + " ### Aucun attachement");

        this.setChanged();
        this.notifyObservers(objet);
    }
}
