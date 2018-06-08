/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.business.impl;

import co.com.AppReserva.AppReserva.business.IReservaBusiness;
import co.com.AppReserva.AppReserva.dao.IHabitacionDao;
import co.com.AppReserva.AppReserva.dao.IReservaDao;
import co.com.AppReserva.AppReserva.model.Habitacion;
import co.com.AppReserva.AppReserva.model.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Laura
 */
public class ReservaBusinessImpl implements IReservaBusiness{

    
    @Autowired
    IReservaDao  reservaDao;

    @Autowired
    IHabitacionDao habitacionDao; 
    @Override
    
    public List<Reserva> obtenerReserva() {
        return reservaDao.obtenerReserva();
    }

    @Override
    public Reserva obtenerReserva(String id) {
        return reservaDao.ObtenerReserva(id);
    }

    @Override
    public String crearReserva(Reserva reserva) {
        Habitacion habitacion = habitacionDao.ObtenerHabitacion(reserva.getHabitacion().getIdHabitacion());
                if(habitacion != null) {
    		return "El productono no existe, no se puede realizar el momiviento";
    	}
    	if(reserva.getPrecio() < 0) {
    		return "El valor debe ser mayor a 0";
    	}
    	
    	
        return reservaDao.crearReservan(reserva);
    }
    
    
}
