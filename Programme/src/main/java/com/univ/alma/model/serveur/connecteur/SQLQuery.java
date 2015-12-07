package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.ConnecteurSimple;
import com.univ.alma.metaModel.connecteurSimple.Role;

/**
 * Created by imadhy on 07/12/15.
 */
public class SQLQuery extends ConnecteurSimple {
    private Role sqlQueryCalled;
    private Role sqlQueryCaller;

    public SQLQuery(String nom) {
        super(nom);

        sqlQueryCalled = new SQLQueryCalled("SQL Query Called");
        sqlQueryCaller = new SQLQueryCaller("SQL Query Caller");

        System.out.println("Creation du connecteur " + nom);
        this.addRole(sqlQueryCalled);
        this.addRole(sqlQueryCaller);
    }
}
