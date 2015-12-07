package com.univ.alma.model.serveur.connexionManager;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServiceConnectionManager extends ServiceComposantSimple {
    public ServiceConnectionManager(String nom) {
        super(nom);

        System.out.println("Creation Services Connection Manager " + nom);
    }
}
