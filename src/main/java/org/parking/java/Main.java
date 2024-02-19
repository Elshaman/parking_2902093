package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        

        Vehiculo carrito1 = new Vehiculo("ASD 789" , 
                              TipoVehiculo.PARTICULAR);
     
        Vehiculo carrito2 = new Vehiculo("XHJ 567",
                               TipoVehiculo.TAXI );
        
        //crear(instanciar) un cliente
        Cliente cliente1 = new Cliente("Cristian" ,
                                       "Buitrago" , 
                                       124421421L);
        ;
        //invocar el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("WWW ERT",
                 TipoVehiculo.MOTO);
        //recorrer la lista de vehiculos
        //del cliente
        for(Vehiculo v :cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("---------");
        }
        
    }
}