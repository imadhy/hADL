package com.univ.alma.model.serveur.connexionManager;

import com.univ.alma.metaModel.composantSimple.ComposantSimple;
import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */

public class ConnexionManager extends ComposantSimple {

    private InterfaceComposantSimple interfaceCM;

    public ConnexionManager(String nom) {
        super(nom);

        interfaceCM = new InterfaceConnectionManager("Connextion Manager");
        System.out.println("Creation Composant Simple : " + nom);
        this.addInterfaceComposantSimple(interfaceCM);
    }
}