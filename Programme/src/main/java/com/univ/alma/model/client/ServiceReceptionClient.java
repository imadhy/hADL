package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by imadhy on 03/12/15.
 */
public class ServiceReceptionClient extends ServiceComposantSimpleRequis implements Observer{

    private PortReceptionClient portReceptionClient;

    public ServiceReceptionClient(String nom) {
        super(nom);
        String portNom = nom.replace("Service", "Port");

        this.portReceptionClient = new PortReceptionClient(portNom, this);
        this.portReceptionClient.addObserver(this);
        this.addPortCompSimpRequis(portReceptionClient);
    }

    public PortReceptionClient getPortReceptionClient() {
        return this.portReceptionClient;
    }

    public void update(Observable o, Object objet) {
        if(o instanceof PortReceptionClient) {
            this.setChanged();
            this.notifyObservers(objet);
        }
    }
}
