package com.univ.alma.metaModel.connecteurSimple;

import com.univ.alma.metaModel.connecteur.Connecteur;

import java.util.ArrayList;
import java.util.List;

public class ConnecteurSimple extends Connecteur{

    private List<Role> listeRole;
    private List<InterfaceConnecteurSimple> listeInterfaceConnecteurSimple;

    public ConnecteurSimple(String nom) {
        listeRole = new ArrayList<Role>();
        listeInterfaceConnecteurSimple = new ArrayList<InterfaceConnecteurSimple>();

        System.out.println("Creation Connecteur Simple " + nom);
    }

    public void addRole(Role role) {
        listeRole.add(role);
    }

    public Role getRole(String nom) {
        for(int i = 0;i<listeRole.size();i++) {
            if(this.listeRole.get(i).getNom().equalsIgnoreCase(nom))
                return listeRole.get(i);
        }
        return null;
    }

    public void addInterfaceConnecteurSimple(InterfaceConnecteurSimple ICS) {
        listeInterfaceConnecteurSimple.add(ICS);
    }

    public InterfaceConnecteurSimple getInterfaceConnecteurSimple(String nom) {
        for(int i = 0;i<listeInterfaceConnecteurSimple.size();i++) {
            if(this.listeInterfaceConnecteurSimple.get(i).getNom().equalsIgnoreCase(nom))
                return listeInterfaceConnecteurSimple.get(i);
        }
        return null;
    }

    @Override
    protected void glue() {

    }
}
