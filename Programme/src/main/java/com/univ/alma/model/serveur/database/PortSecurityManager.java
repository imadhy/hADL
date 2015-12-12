package com.univ.alma.model.serveur.database;

import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimpleRequis;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;

/**
 * Created by imadhy on 07/12/15.
 */

public class PortSecurityManager extends PortComposantSimpleRequis {

    public PortSecurityManager(String nom, ServiceComposantSimpleRequis S) {
        super(nom, S);
        //System.out.println("Creation du Port : " + nom);
    }
}