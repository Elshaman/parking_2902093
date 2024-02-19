package org.parking.java.entities;

public class Vehiculo {

    public String placa;
    public TipoVehiculo tipoVehiculo;

    //constructor
    //Sin parametros: constructor por defecto
    public Vehiculo() {
    }

    //constructor parametrizado
    public Vehiculo(String placa,
                   TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    
    
    

}
