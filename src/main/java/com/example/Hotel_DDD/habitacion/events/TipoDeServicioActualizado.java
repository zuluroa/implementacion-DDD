package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.ServicioID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class TipoDeServicioActualizado extends DomainEvent {
    private final ServicioID servicioID;
    private final Tipo nuevoTipo;

    public TipoDeServicioActualizado(ServicioID servicioID, Tipo nuevoTipo) {
        super("sofka.habitacion.tipodeservicioactualizado");
        this.servicioID = servicioID;
        this.nuevoTipo = nuevoTipo;
    }

    public ServicioID getServicioID() {
        return servicioID;
    }

    public Tipo getNuevoTipo() {
        return nuevoTipo;
    }
}
