package com.univ.alma.model.serveur.database;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;

/**
 * Created by imadhy on 07/12/15.
 */
public class InterfaceDataBase extends InterfaceComposantSimple {

    private ServiceComposantSimpleRequis servicesDatabase;
    private PortComposantSimple portSecuManager;
    private PortComposantSimple portQuery;

    public InterfaceDataBase(String nom) {
        servicesDatabase = new ServicesDataBase("Data Base");
        portSecuManager = new PortSecurityManager("Security Manager", servicesDatabase);
        portQuery = new PortQuery("Port Query");

        System.out.println("Creation de l'Interface : " + nom);
        this.addServiceComposantSimple(servicesDatabase);
        this.addPortComposantSimple(portSecuManager);
        this.addPortComposantSimple(portQuery);
    }
}
