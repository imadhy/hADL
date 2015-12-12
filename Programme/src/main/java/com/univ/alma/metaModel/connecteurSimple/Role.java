package com.univ.alma.metaModel.connecteurSimple;

import com.univ.alma.metaModel.core.Interface;

import java.util.Observable;

public abstract class Role extends Observable implements Interface {

    public void send(Object message){

        System.out.println("\nSend | Role: " + this.getClass().getSimpleName() + " | message = " + message);

        this.setChanged();
        this.notifyObservers(message);
    }

}
