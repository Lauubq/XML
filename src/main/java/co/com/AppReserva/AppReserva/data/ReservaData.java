/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.data;

import co.com.AppReserva.AppReserva.model.Habitacion;
import co.com.AppReserva.AppReserva.model.Reserva;
import co.com.AppReserva.AppReserva.model.TipoHabitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura
 */
public class ReservaData {
    
        private static List<Reserva> listaReserva;
    static{
        listaReserva = new ArrayList<Reserva>(){
           { 
                
            add(new Reserva("100", new Habitacion("102", "Tenis", 0D, 0D), 
                    5D, 20000D, TipoHabitacion.compartida));
    
           }
       };
    }

    public static List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public static void setListaReserva(List<Reserva> aListaReserva) {
        listaReserva = aListaReserva;
    }
    
}
