package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.ComposantSimple;
import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by imadhy on 03/12/15.
 */
public class Client extends ComposantSimple implements Observer{

    private InterfaceComposantSimple interfaceClient;

    public Client(String name) {
        super(name);

        interfaceClient = new InterfaceClient("Interface Client");

        System.out.println("Creation du Composant Simple : " + nom);
        this.addInterfaceComposantSimple(interfaceClient);
    }

    public void send(Object message) {

    }

    public void update(Observable o, Object arg) {

    }
}
