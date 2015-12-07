package com.univ.alma.model.serveur.connexionManager;

import com.univ.alma.metaModel.composantSimple.ComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class PortDBQuery extends PortComposantSimple {
    public PortDBQuery(String nom) {
        System.out.println("Creation DataBase Query " + nom);
    }
}
