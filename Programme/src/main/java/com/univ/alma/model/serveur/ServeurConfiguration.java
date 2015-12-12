package com.univ.alma.model.serveur;

import com.univ.alma.metaModel.composant.Composant;
import com.univ.alma.metaModel.configuration.Configuration;
import com.univ.alma.metaModel.connecteurSimple.ConnecteurSimple;
import com.univ.alma.metaModel.core.AttachmentRequis;
import com.univ.alma.model.serveur.connecteur.SQLQuery;
import com.univ.alma.model.serveur.connexionManager.ConnexionManager;
import com.univ.alma.model.serveur.database.DataBase;
import com.univ.alma.model.serveur.securityManager.SecurityManager;

import java.util.List;

/**
 * Created by imadhy on 07/12/15.
 */
public class ServeurConfiguration extends Configuration {

    //private Composant dataBase;
    //private Composant securityManager;
    //private Composant connectionManager;

    public ServeurConfiguration(String nom) {
        super(nom);


        Composant dataBase = new DataBase("Data-Base");
        Composant securityManager = new SecurityManager("Security Manager");
        Composant connectionManager = new ConnexionManager("Connexion Manager");

        ConnecteurSimple sqlQuery = new SQLQuery("SQL Query");



        this.addComposant(dataBase);
        this.addComposant(securityManager);
        this.addComposant(connectionManager);

        System.out.println("Creation du Serveur Configuration : " + nom);
    }
}
