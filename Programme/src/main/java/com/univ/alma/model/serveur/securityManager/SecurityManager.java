package com.univ.alma.model.serveur.securityManager;

import com.univ.alma.metaModel.composantSimple.ComposantSimple;
import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class SecurityManager extends ComposantSimple {

    private InterfaceComposantSimple interfaceSM;

    public SecurityManager(String nom) {
        super(nom);

        interfaceSM = new InterfaceSecurityManager("Security Manager");
        System.out.println("Creation Security Manager : " + nom);
        this.addInterfaceComposantSimple(interfaceSM);
    }
}
