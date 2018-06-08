/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.controller;
import co.com.AppReserva.AppReserva.business.IReservaBusiness;
import co.com.AppReserva.AppReserva.model.Reserva;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")

public class ReservaController {
    @Autowired
	IReservaBusiness  reservaBusiness;
    
    @GetMapping("/reservas")
    public List<Reserva> obtenerMovimientos(){
     return reservaBusiness.obtenerReserva();
    }
    
    @GetMapping("/reservas/{id}")
    public Reserva obtenerMovimiento(@PathVariable String id){
     return reservaBusiness.obtenerReserva(id);
    }
    
    @PostMapping("/reservas")
    public String crearMovimiento(Reserva reserva){
        return reservaBusiness.crearReserva(reserva);
    }
    
      
    
    
}
