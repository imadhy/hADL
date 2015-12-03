package com.univ.alma.metaModel.configuration;

import java.util.ArrayList;
import java.util.List;

import com.univ.alma.metaModel.composant.Composant;
import com.univ.alma.metaModel.connecteur.Connecteur;
import com.univ.alma.metaModel.core.Interface;


public class Configuration extends Composant {
	
	private List<Composant> listeComposant;
	private List<InterfaceConfiguration> listeInterface;
	private List<Connecteur> listeConnecteur;

    public Configuration(String nom) {
        this.nom = nom;
        this.listeComposant = new ArrayList<Composant>();
        this.listeInterface = new ArrayList<InterfaceConfiguration>();
        this.listeConnecteur = new ArrayList<Connecteur>();

        System.out.println("Creation Configuration " + nom);
    }

    public void addComposant(Composant composant) {
        listeComposant.add(composant);
    }

    public Composant getComposant(String nom) {
        for(int i = 0;i<listeComposant.size();i++) {
            if(this.listeComposant.get(i).getNom().equalsIgnoreCase(nom))
                return listeComposant.get(i);
        }
        return null;
    }

    public void addInterface(InterfaceConfiguration interfaceConfig) {
        listeInterface.add(interfaceConfig);
    }

    public InterfaceConfiguration getInterfaceConfig(String nom) {
        for (int i = 0;i<listeInterface.size();i++) {
            if(this.listeInterface.get(i).getNom().equalsIgnoreCase(nom))
                return listeInterface.get(i);
        }
        return null;
    }

    public void addConnecteur(Connecteur connecteur) {
        listeConnecteur.add(connecteur);
    }

    public Connecteur getConnecteur(String nom) {
        for (int i = 0;i<listeConnecteur.size();i++) {
            if(this.listeConnecteur.get(i).getNom().equalsIgnoreCase(nom))
                return listeConnecteur.get(i);
        }
        return null;
    }
}
