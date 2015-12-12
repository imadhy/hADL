package com.univ.alma.model.serveur.securityManager;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class InterfaceSecurityManager extends InterfaceComposantSimple {
    private ServiceComposantSimple servicesSecuManager;
    private PortComposantSimple portCheckQuery;
    private PortComposantSimple portSecuAuth;

    public InterfaceSecurityManager(String nom) {
        servicesSecuManager = new ServicesSecurityManager("Security Manager");
        portSecuAuth = new PortSecurityAuth("Security Authentification");
        portCheckQuery = new PortCheckQuery("Check Query");

        System.out.println("Creation Interface : " + nom);
        this.addServiceComposantSimple(servicesSecuManager);
        this.addPortComposantSimple(portSecuAuth);
        this.addPortComposantSimple(portCheckQuery);
    }
}
