package com.univ.alma.model.serveur.database;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServicesDataBase extends ServiceComposantSimple {
    public ServicesDataBase(String nom) {
        super(nom);

        System.out.println("Creation Services Databases" + nom);
    }
}
