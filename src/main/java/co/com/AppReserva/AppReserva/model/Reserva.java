/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.model;

/**
 *
 * @author Laura
 */
public class Reserva {
   
    private String idReserva;
    private Habitacion habitacion;
    private Double numcamas;
    private Double precio;
    
    public Reserva() {
    }

    public Reserva(String idReserva, Habitacion habitacion, Double numcamas, Double precio) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.numcamas = numcamas;
        this.precio = precio;
       
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Double getNumcamas() {
        return numcamas;
    }

    public void setNumcamas(Double numcamas) {
        this.numcamas = numcamas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
