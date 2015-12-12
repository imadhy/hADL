package com.univ.alma.model.serveur.securityManager;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServicesSecurityManager extends ServiceComposantSimple {
    public ServicesSecurityManager(String nom) {
        super(nom);

        System.out.println("Creation Services : " + nom);
    }
}
