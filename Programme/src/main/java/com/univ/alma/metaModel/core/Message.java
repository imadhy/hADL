package com.univ.alma.metaModel.core;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;

/**
 * Created by imadhy on 12/12/15.
 */
public class Message {

    public enum StatutMessage {
        SUIVRE, REPONSE
    }

    private Object message;

    private StatutMessage statut;

    private ServiceComposantSimpleRequis serviceSource;
    private ServiceComposantSimpleFourni serviceCible;

    public Message(Object message, ServiceComposantSimpleRequis serviceSource, ServiceComposantSimpleFourni serviceCible){
        this.message = message;
        this.serviceSource = serviceSource;
        this.serviceCible = serviceCible;

        this.statut = StatutMessage.SUIVRE;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }


    public ServiceComposantSimpleFourni getServiceCible() {
        return serviceCible;
    }

    public ServiceComposantSimpleRequis getServiceSource() {
        return serviceSource;
    }

    public StatutMessage getStatut() {
        return statut;
    }

    public void repondre(){
        this.statut = StatutMessage.REPONSE;
    }

    @Override
    public String toString(){
        return "[" + this.serviceCible.getClass().getSimpleName() + "] " + this.message;
    }
}
