/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.business.impl;

import co.com.AppReserva.AppReserva.business.IHabitacionBusiness;
import co.com.AppReserva.AppReserva.dao.IHabitacionDao;
import co.com.AppReserva.AppReserva.model.Habitacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Laura
 */
public class HabitacionBusinessImpl implements IHabitacionBusiness {

     @Autowired
    IHabitacionDao habitacionDao;
    
    @Override
    public List<Habitacion> obtenerHabitacion() {
        return habitacionDao.obtenerHabitacion();
    }

    @Override
    public Habitacion obtenerHabitacion(String id) {
      return habitacionDao.ObtenerHabitacion(id);
    }

    @Override
    public String crearHabitacion(Habitacion habitacion) {
      return habitacionDao.crearHabitacion(habitacion);
    }
    
}
