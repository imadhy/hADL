package com.univ.alma.metaModel.composantSimple;

import com.univ.alma.metaModel.configuration.PortConfigurationFourni;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imadhy on 03/12/15.
 */
public class ServiceComposantSimpleFourni extends ServiceComposantSimple{
    List<PortComposantSimpleFourni> listePortFournis;

    public ServiceComposantSimpleFourni(String nom) {
        this.nom = nom;
        this.listePortFournis = new ArrayList<PortComposantSimpleFourni>();

        System.out.println("Creation Service Composant Simple Fourni : " + this.nom);
    }

    public void addPortCompSimpFourni(PortComposantSimpleFourni PCSF) {
        this.listePortFournis.add(PCSF);
    }

    public PortComposantSimpleFourni getPortCompSimpFourni(String nom) {
        for (int i = 0;i<listePortFournis.size();i++) {
            if(this.listePortFournis.get(i).getNom().equalsIgnoreCase(nom))
                return listePortFournis.get(i);
        }
        return null;
    }
}
