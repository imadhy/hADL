package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.RoleFourni;

/**
 * Created by imadhy on 07/12/15.
 */
public class SQLQueryCaller extends RoleFourni {
    public SQLQueryCaller(String nom) {
        super(nom);

        System.out.println("Creation du role Fourni " + nom);
    }
}
