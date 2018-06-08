/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.data;

import co.com.AppReserva.AppReserva.model.Habitacion;
import co.com.AppReserva.AppReserva.model.TipoHabitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura
 */
public class HabitacionData {
    
     private static List<Habitacion> listaHabitacion;
    static{
        listaHabitacion = new ArrayList<Habitacion>(){
           { 
                
            add(new Habitacion("100",5D, 20000D, TipoHabitacion.compartida));
    
           }
       };
    }

    public static List<Habitacion> getListaHabitacion() {
        return listaHabitacion;
    }

    public static void setListaHabitacion(List<Habitacion> aListaHabitacion) {
        listaHabitacion = aListaHabitacion;
    }
    
}
