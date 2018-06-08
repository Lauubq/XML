/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.business;

import co.com.AppReserva.AppReserva.model.Habitacion;
import co.com.AppReserva.AppReserva.model.Reserva;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IReservaBusiness {
    List<Reserva> obtenerReserva();
    Reserva obtenerReserva(String id);
    String crearReserva(Reserva reserva);
}
