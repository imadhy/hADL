package com.univ.alma.metaModel.composant;

import com.univ.alma.metaModel.composantSimple.InterfaceComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimple;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public abstract class Composant extends Observable {
    public abstract List<ServiceComposantSimpleFourni> getServicesFournis();
}
