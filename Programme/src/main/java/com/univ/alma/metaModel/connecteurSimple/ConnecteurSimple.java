package com.univ.alma.metaModel.connecteurSimple;

import com.univ.alma.metaModel.connecteur.Connecteur;

import java.util.ArrayList;
import java.util.List;

public class ConnecteurSimple extends Connecteur {

    private List<Glue> glues;

    public ConnecteurSimple() {
        this.glues = new ArrayList<>();
    }

    public void addGlue(Glue glue){
        this.glues.add(glue);
    }
}
