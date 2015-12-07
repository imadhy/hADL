package com.univ.alma.model.serveur;

import com.univ.alma.metaModel.composant.Composant;
import com.univ.alma.metaModel.composantSimple.ComposantSimple;
import com.univ.alma.metaModel.configuration.Configuration;
import com.univ.alma.model.serveur.connexionManager.ConnexionManager;
import com.univ.alma.model.serveur.database.DataBase;
import com.univ.alma.model.serveur.securityManager.SecurityManager;

import java.util.List;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServeurConfiguration extends Configuration {

    private Composant dataBase;
    private Composant securityManager;
    private Composant connectionManager;

    public ServeurConfiguration(String nom) {
        super(nom);

        dataBase = new DataBase("Data-Base");
        securityManager = new SecurityManager("Security Manager");
        connectionManager = new ConnexionManager("Connexion Manager");

        this.addComposant(dataBase);
        this.addComposant(securityManager);
        this.addComposant(connectionManager);

        System.out.println("Creation Serveur Configuration " + nom);
    }
}
