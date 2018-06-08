/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.dao;

import co.com.AppReserva.AppReserva.model.Habitacion;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IHabitacionDao {
    List<Habitacion> obtenerHabitacion();
    Habitacion ObtenerHabitacion(String id);
    String crearHabitacion(Habitacion habitacion);
    String eliminarHabitacion(String id);
    String modificarHabitacion(Habitacion habitacion);
}
