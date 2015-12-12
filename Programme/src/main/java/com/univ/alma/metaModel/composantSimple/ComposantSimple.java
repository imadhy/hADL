package com.univ.alma.metaModel.composantSimple;

import java.util.*;

import com.univ.alma.metaModel.composant.Composant;

public class ComposantSimple extends Composant implements Observer {

    private List<PortComposantSimpleRequis> portsRequis;
    private List<PortComposantSimpleFourni> portsFournis;

    private List<ServiceComposantSimpleRequis> servicesRequis;
    private List<ServiceComposantSimpleFourni> servicesFournis;

	public ComposantSimple() {
        this.portsRequis = new ArrayList<PortComposantSimpleRequis>();
        this.portsFournis = new ArrayList<PortComposantSimpleFourni>();

        this.servicesRequis = new ArrayList<ServiceComposantSimpleRequis>();
        this.servicesFournis = new ArrayList<ServiceComposantSimpleFourni>();
    }

    public void addServicesRequis(ServiceComposantSimpleRequis service){

        this.portsRequis.addAll(service.getPortsRequis());
        this.portsFournis.addAll(service.getPortsFournis());

        for(PortComposantSimpleFourni port: service.getPortsFournis()){
            port.addObserver(this);
        }

        this.servicesRequis.add(service);
    }

    public void addServicesFourni(ServiceComposantSimpleFourni service){

        this.portsRequis.addAll(service.getPortsRequis());
        this.portsFournis.addAll(service.getPortsFournis());

        for(PortComposantSimpleFourni port: service.getPortsFournis()){
            port.addObserver(this);
        }

        this.servicesFournis.add(service);
    }

	public void update(Observable o, Object message) {
        System.out.println("\nUpdate | Composant: " + this.getClass().getSimpleName() + " | message = " + message);

        this.setChanged();
        this.notifyObservers(message);
	}

    public List<ServiceComposantSimpleFourni> getServicesFourni(){
        return new ArrayList<>(this.servicesFournis);
    }

    public boolean searchPort(PortComposantSimple port){
        return this.portsFournis.contains(port) || this.portsRequis.contains(port);
    }

    public ServiceComposantSimpleRequis searchServiceRequis(PortComposantSimple port) {
        for(ServiceComposantSimpleRequis service : this.servicesRequis){
            if(service.getPortsRequis().contains(port)){
                return service;
            }
        }
        return null;
    }

    public ServiceComposantSimpleFourni searchServiceFourni(PortComposantSimple port) {
        for(ServiceComposantSimpleFourni service : this.servicesFournis){
            if(service.getPortsFournis().contains(port)){
                return service;
            }
        }
        return null;
    }

    public List<ServiceComposantSimpleFourni> getServicesFournis(){
        return new ArrayList<>(this.servicesFournis);
    }
}
