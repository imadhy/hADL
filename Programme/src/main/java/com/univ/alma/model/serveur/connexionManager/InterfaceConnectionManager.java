package com.univ.alma.model.serveur.connexionManager;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class InterfaceConnectionManager extends InterfaceComposantSimple {
    private ServiceComposantSimple serviceConnectionManager;
    private PortComposantSimple portDBQuery;
    private PortComposantSimple portSecurityCheck;
    private PortComposantSimple portExternalSocket;

    public InterfaceConnectionManager(String nom) {
        serviceConnectionManager = new ServiceConnectionManager("Connection Manager");
        portDBQuery = new PortDBQuery("Data Base Query");
        portSecurityCheck = new PortSecurityCheck("Security Check");
        portExternalSocket = new PortExternalSocket("External Socket");

        System.out.println("Creation Interface Connection Manager " + nom);
        this.addServiceComposantSimple(serviceConnectionManager);
        this.addPortComposantSimple(portDBQuery);
        this.addPortComposantSimple(portSecurityCheck);
        this.addPortComposantSimple(portExternalSocket);
    }
}
