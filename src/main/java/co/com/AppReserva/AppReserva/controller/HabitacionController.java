/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.AppReserva.AppReserva.controller;
import co.com.AppReserva.AppReserva.business.IHabitacionBusiness;
import co.com.AppReserva.AppReserva.model.Habitacion;
import java.util.List;
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
public class HabitacionController {
     @Autowired
    private IHabitacionBusiness  habitacionBusiness;
     
     @GetMapping("/productos")
    public List<Habitacion> obtenerProductos(){
     return habitacionBusiness.obtenerHabitacion();
    }
    
    @GetMapping("/productos/{id}")
    public Habitacion obtenerProducto(@PathVariable String id){
     return habitacionBusiness.obtenerHabitacion(id);
    }
    
    @PostMapping("/productos")
    public String crearProductos(Habitacion habitacion){
        return habitacionBusiness.crearHabitacion(habitacion);
    }
     
     
}
