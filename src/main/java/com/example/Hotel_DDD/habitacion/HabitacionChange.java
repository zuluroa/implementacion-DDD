package com.example.Hotel_DDD.habitacion;

import co.com.sofka.domain.generic.EventChange;
import com.example.Hotel_DDD.alquiler.events.HabitacionCreada;
import com.example.Hotel_DDD.habitacion.events.*;

import java.util.HashSet;

public class HabitacionChange extends EventChange {

    public HabitacionChange(Habitacion habitacion) {
        apply((HabitacionCreada event) -> {
            habitacion.habitacionID = event.getHabitacionID();
            habitacion.servicio = new HashSet<>();
            habitacion.tecnologia = new HashSet<>();
            habitacion.CupoMaximo = event.getCupoMaximo();
            habitacion.PrecioTotal = event.getPrecioTotal();
        });

        apply((CupoMaximoActualizado event) -> {
            habitacion.actualizarCupoMaximo(event.getHabitacionID(),event.getCupoMaximoActualizado());
        });

        apply((ServicioCreado event) -> {
            habitacion.crearServicio(event.getTipo(),event.getPrecio());
        });

        apply((ServicioCambiado event) -> {
            habitacion.cambiarServicio(event.getOldservicio(),event.getNewservicio());
        });

        apply((PrecioDeServicioActualizado event) -> {
            habitacion.actualizarPrecioDeServicio(event.getServicioID(),event.getNuevoPrecio());
        });

        apply((TipoDeServicioActualizado event) -> {
            habitacion.actualizarTipoDeServicio(event.getServicioID(),event.getNuevoTipo());
        });

        apply((TecnologiaCreada event) -> {
            habitacion.crearTecnologia(event.getTipo(),event.getPrecio());
        });

        apply((TecnologiaCambiada event) -> {
            habitacion.cambiarTecnologia(event.getOldtecnologia(),event.getNewtecnologiaID());
        });

        apply((PrecioDeTecnologiaActualizado event) -> {
            habitacion.actualizarPrecioDeTecnologia(event.getTecnologiaID(),event.getNuevoPrecio());
        });

        apply((TipoDeTecnologiaActualizado event) -> {
            habitacion.actualizarTipoDeTecnologia(event.getTecnologiaID(),event.getNuevoTipo());
        });
    }

}
