package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        Vehiculo carrito1 = new Vehiculo("ASD 789" , 
                              TipoVehiculo.PARTICULAR);
     
        Vehiculo carrito2 = new Vehiculo("XHJ 567",
                               TipoVehiculo.TAXI );

        Vehiculo motico = new Vehiculo();
        motico.setPlaca("XS 439");

        
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
       
        //instanciar cupos: 
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //crear fechas:
        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024 , 
                                                        Month.FEBRUARY , 
                                                        1 , 
                                                        15 , 
                                                        30 , 
                                                        0 ); 
        LocalDateTime fechaHoraFin = LocalDateTime.of(2024 , 
                                                        Month.FEBRUARY , 
                                                        10 , 
                                                        6 , 
                                                        15 , 
                                                        0 );                                                 

        //hacer registros(pagos) E/S de vehiculos
        Pago pago1 = new Pago(fechaHoraInicio ,
                              fechaHoraFin , 
                              5000.0 ,
                              cliente1.misVehiculos.get(0) , 
                              cupito1);
        Pago pago2 = new Pago(
                                fechaHoraInicio ,
                                fechaHoraFin , 
                                10000.0 ,
                                cliente1.misVehiculos.get(1) , 
                                cupito2
        );

        //añadir pagos a una lista de pagos
        List<Pago> misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);

        //recorrer los pagos para mostrar informacion
        for( Pago p : misPagos ){
            //evidencia:
            //mostrar: 
            //   - Placa del vehiculo
            //   - valor pagado
            //   - fecha y hora de inicio
            //   - fecha y hora de fin
            //   - cupo(nombre)
            System.out.println( "Pago:|Placa:" + p.getVehiculo().getPlaca()  + "|" +
                                  "|valor:" + p.getValor() + "|" + 
                                  "|fecha y hora entrada:" + 
                                   p.getFechaHoraInicio().toString() + "|" +
                                  "|Cupo:" + p.getCupo().getNombre() + "|" );
        }
        
        
    }
}