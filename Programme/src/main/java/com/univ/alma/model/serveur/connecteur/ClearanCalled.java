package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.RoleRequis;

/**
 * Created by imadhy on 07/12/15.
 */
public class ClearanCalled extends RoleRequis {
    public ClearanCalled(String nom) {
        super(nom);

        System.out.println("Creation Role requis " + nom);
    }
}
