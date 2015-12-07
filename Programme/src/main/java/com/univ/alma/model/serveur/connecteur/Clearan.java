package com.univ.alma.model.serveur.connecteur;

import com.univ.alma.metaModel.connecteurSimple.ConnecteurSimple;
import com.univ.alma.metaModel.connecteurSimple.Role;

/**
 * Created by imadhy on 07/12/15.
 */
public class Clearan extends ConnecteurSimple {
    private Role clearanCalled;
    private Role clearanCaller;

    public Clearan(String nom) {
        super(nom);

        clearanCalled = new ClearanCalled("Clearan Called");
        clearanCaller = new ClearanCaller("Clearan Caller");

        System.out.println("Creation du connecteur " + nom);
        this.addRole(clearanCalled);
        this.addRole(clearanCaller);
    }
}
