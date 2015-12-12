package com.univ.alma.model.serveur;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.PortComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleRequis;
import com.univ.alma.metaModel.core.Interface;

/**
 * Created by imadhy on 07/12/15.
 */
public class InterfaceServeur extends InterfaceComposantSimple {

    private ServiceComposantSimpleRequis serveurServices;
    private PortComposantSimple portReceiveServeur;

    public InterfaceServeur(String nom) {
        serveurServices = new ServeurServices("Services du Serveur");
        portReceiveServeur = new PortReceiveRequest("Port receive request", serveurServices);

        this.addPortComposantSimple(portReceiveServeur);
        this.addServiceComposantSimple(serveurServices);

        System.out.println("Creation Interface Serveur : " + nom);
    }
}
