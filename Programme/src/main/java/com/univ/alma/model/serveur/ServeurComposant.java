package com.univ.alma.model.serveur;

import com.univ.alma.metaModel.composant.Composant;
import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */

public class ServeurComposant extends Composant {

    private InterfaceComposantSimple interfaceServeur;

    public ServeurComposant(String nom) {
        interfaceServeur = new InterfaceServeur("Interface serveur");

        this.addInterfaceComposantSimple(interfaceServeur);
        System.out.println("Creation Serveur Composant : " + nom);
    }
}
