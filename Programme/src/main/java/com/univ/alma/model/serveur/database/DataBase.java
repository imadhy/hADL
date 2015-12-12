package com.univ.alma.model.serveur.database;

import com.univ.alma.metaModel.composantSimple.ComposantSimple;
import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.core.Interface;

/**
 * Created by imadhy on 07/12/15.
 */
public class DataBase extends ComposantSimple {

    private InterfaceComposantSimple interfaceDB;

    public DataBase(String nom) {
        super(nom);

        interfaceDB = new InterfaceDataBase("Data-Base");
        System.out.println("Creation du Composant Simple : " + nom);
        this.addInterfaceComposantSimple(interfaceDB);
    }
}
