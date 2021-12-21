package com.example.Hotel_DDD.alquiler;

import co.com.sofka.domain.generic.EventChange;

import com.example.Hotel_DDD.alquiler.events.*;
import com.example.Hotel_DDD.reserva.events.AlquilerCreado;

import java.util.HashSet;


public class AlquilerChange extends EventChange {

    public AlquilerChange(Alquiler alquiler) {

        apply((AlquilerCreado event) ->{
            alquiler.habitacion = new HashSet<>();;;
            alquiler.entregaID = event.getEntregaID();
            alquiler.estadoID = event.getEstadoID();
            alquiler.duracion = event.getDuracion();
            alquiler.alquilerID = event.getAlquilerID();
        });

        apply((HabitacionCreada event) ->{
            alquiler.crearHabitacion(event.getCupoMaximo(),event.getPrecioTotal());
        });

        apply((HabitacionCambiada event) ->{
            alquiler.CambiarHabitacion(event.getOldhabitacionID(),event.getNewhabitacionID());
        });

        apply((EntregaCreada event) ->{
            alquiler.CrearEntrega(event.getFecha());
        });

        apply((FechaDeEntregaActualizada event) ->{
            alquiler.ActualizarFechaDeEntrega(event.getHabitacionID(),event.getNuevaFecha());
        });

        apply((DuracionCambiada event) ->{
            alquiler.ActualizarDuracion(event.getAlquilerID(),event.getNuevaDuracion());
        });

        apply((EstadoCreado event) ->{
            alquiler.CrearEstado(event.getEstado());
        });

        apply((ObservacionesDeEstadoActualizada event) ->{
            alquiler.ActualizarObservacionesDeEstado(event.getEstadoID(),event.getEstado());
        });
    }
}
