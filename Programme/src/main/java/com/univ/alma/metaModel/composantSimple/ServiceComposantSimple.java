package com.univ.alma.metaModel.composantSimple;

import java.util.ArrayList;
import java.util.List;

public abstract class ServiceComposantSimple {

    private List<PortComposantSimpleRequis> portsRequis;
    private List<PortComposantSimpleFourni> portsFournis;

    public ServiceComposantSimple(){
        this.portsRequis = new ArrayList<PortComposantSimpleRequis>();
        this.portsFournis = new ArrayList<PortComposantSimpleFourni>();
    }

    public void addPortRequis(PortComposantSimpleRequis port){
        this.portsRequis.add(port);
    }

    public void addPortFourni(PortComposantSimpleFourni port){
        this.portsFournis.add(port);
    }

    public Object update(Object params) {
        System.out.println("\nProccessing | Service: " + this.getClass().getSimpleName() + " | message = " + params);
        return "";
    }

    public List<PortComposantSimpleRequis> getPortsRequis(){
        return this.portsRequis;
    }

    public List<PortComposantSimpleFourni> getPortsFournis(){
        return this.portsFournis;
    }
}
