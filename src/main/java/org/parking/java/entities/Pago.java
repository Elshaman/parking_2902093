package org.parking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //Atributos intrínsecos
    public LocalDateTime fechaHoraInicio;
    public LocalDateTime fechaHoraFin;
    public Double valor;

    //Atributos de Relacion:
    public Vehiculo vehiculo; 
    public Cupo cupo;
    
    //constructor por defecto
    public Pago() {
    }

 //Constructor parametrizado
    public Pago(LocalDateTime fechaHoraInicio,
                LocalDateTime fechaHoraFin,
                Double valor,
                Vehiculo vehiculo,
                Cupo cupo) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
    }

   
    

}
