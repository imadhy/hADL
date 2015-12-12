package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.*;
import com.univ.alma.model.connecteur.GlueSQLQuery;

/**
 * Created by imadhy on 07/12/15.
 */
public class SQLQuery extends ConnecteurSimple {
    private RoleRequis sqlQueryCalled;
    private RoleFourni sqlQueryCaller;

    public SQLQuery(String nom) {
        super(nom);

        sqlQueryCalled = new SQLQueryCalled("SQL Query Called");
        sqlQueryCaller = new SQLQueryCaller("SQL Query Caller");

        GlueSQLQuery sqlQuery = new GlueSQLQuery(sqlQueryCaller, sqlQueryCalled);

        System.out.println("Creation du connecteur " + nom);
        this.addGlue(sqlQuery);
    }
}
