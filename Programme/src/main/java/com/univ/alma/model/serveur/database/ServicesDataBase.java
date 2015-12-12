package com.univ.alma.model.serveur.database;

import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServicesDataBase extends ServiceComposantSimpleRequis {
    public ServicesDataBase(String nom) {
        super(nom);

        //System.out.println("Creation du Services : " + nom);
    }
}
