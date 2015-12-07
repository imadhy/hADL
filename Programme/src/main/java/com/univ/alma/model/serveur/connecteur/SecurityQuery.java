package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.ConnecteurSimple;
import com.univ.alma.metaModel.connecteurSimple.Role;

/**
 * Created by imadhy on 07/12/15.
 */
public class SecurityQuery extends ConnecteurSimple {

    private Role securityQeuryCalled;
    private Role securityQueryCaller;

    public SecurityQuery(String nom) {
        super(nom);

        securityQeuryCalled = new SecurityQueryCalled("Security Query Called");
        securityQueryCaller = new SecurityQueryCaller("Security Query Caller");

        System.out.println("Creation du connecteur " + nom);
        this.addRole(securityQeuryCalled);
        this.addRole(securityQueryCaller);
    }
}
