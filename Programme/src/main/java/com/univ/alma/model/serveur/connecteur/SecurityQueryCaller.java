package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.RoleFourni;

/**
 * Created by imadhy on 07/12/15.
 */
public class SecurityQueryCaller extends RoleFourni {
    public SecurityQueryCaller(String nom) {
        super(nom);

        System.out.println("Creation du role Fourni " + nom);
    }
}
