package com.univ.alma.model.serveur.database;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class InterfaceDataBase extends InterfaceComposantSimple {

    private ServiceComposantSimple servicesDatabase;
    private PortComposantSimple portSecuManager;
    private PortComposantSimple portQuery;

    public InterfaceDataBase(String nom) {
        servicesDatabase = new ServicesDataBase("Data Base");
        portSecuManager = new PortSecurityManager("Security Manager");
        portQuery = new PortQuery("Port Query");

        System.out.println("Creation Interface Database " + nom);
        this.addServiceComposantSimple(servicesDatabase);
        this.addPortComposantSimple(portSecuManager);
        this.addPortComposantSimple(portQuery);
    }
}
