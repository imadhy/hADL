package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;

/**
 * Created by imadhy on 03/12/15.
 */
public class PortReceptionClient extends PortComposantSimpleRequis {

    public PortReceptionClient(String name, ServiceComposantSimpleRequis service) {
        super(name, service);
    }

    public void receive(Object objet) {
        if(this.countObservers() == 0)
            System.out.println("#### " + this.getClass().getSimpleName() + " ### Aucun attachement");

        this.setChanged();
        this.notifyObservers(objet);
    }
}
