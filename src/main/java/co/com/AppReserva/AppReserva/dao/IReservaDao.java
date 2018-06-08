/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.dao;

import co.com.AppReserva.AppReserva.model.Habitacion;
import co.com.AppReserva.AppReserva.model.Reserva;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IReservaDao {
    List<Reserva> obtenerReserva();
    Reserva ObtenerReserva(String id);
    String crearReservan(Reserva reserva);
    String eliminarReserva(String id);
    String modificarReserva(Reserva reserva);
}
