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
public class Habitacion {
   
    private String idHabitacion;
    private Double numcamas;
    private TipoHabitacion tipoHabitacion;
    
    
    public Habitacion() {
    }

    public Habitacion(String idHabitacion, Double numcamas, TipoHabitacion tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numcamas = numcamas;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Double getNumcamas() {
        return numcamas;
    }

    public void setNumcamas(Double numcamas) {
        this.numcamas = numcamas;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


}








