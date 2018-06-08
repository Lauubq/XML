/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.business;

import co.com.AppReserva.AppReserva.model.Habitacion;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IHabitacionBusiness {
    List<Habitacion> obtenerHabitacion();
    Habitacion obtenerHabitacion(String id);
    String crearHabitacion(Habitacion habitacion);
    
}
