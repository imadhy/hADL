package com.univ.alma.metaModel.composantSimple;

public class PortComposantSimpleFourni extends PortComposantSimple {

   public void send(Object message){
        System.out.println("Send | PortComposantSimpleFourni: " + this.getClass().getSimpleName() + " | message = " + message);

        this.setChanged();
        this.notifyObservers(message);
    }
}
