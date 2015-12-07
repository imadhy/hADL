package com.univ.alma.model.serveur;

import com.univ.alma.metaModel.composantSimple.PortComposantSimple;

/**
 * Created by imadhy on 07/12/15.
 */
public class PortReceiveRequest extends PortComposantSimple{

    public PortReceiveRequest(String nom) {
        this.setNom(nom);

        System.out.println("Creation Port receive request " + nom);
    }
}
