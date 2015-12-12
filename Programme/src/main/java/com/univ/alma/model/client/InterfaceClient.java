package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;

/**
 * Created by imadhy on 07/12/15.
 */
public class InterfaceClient extends InterfaceComposantSimple {
    private ServiceComposantSimpleFourni serviceCSF;
    private PortComposantSimpleFourni portCSF;

    public InterfaceClient(String nom) {
        serviceCSF = new ServiceClient("Services du Serveur");
        portCSF = new PortSendRequest("Port receive request", serviceCSF);

        this.addPortComposantSimple(portCSF);
        this.addServiceComposantSimple(serviceCSF);

        System.out.println("Creation de l'Interface Client : " + nom);
    }
}
