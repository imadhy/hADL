package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServiceClient extends ServiceComposantSimpleFourni {
    public ServiceClient(String nom) {
        super(nom);

        //System.out.println("Creation du Service " + nom);
    }
}
