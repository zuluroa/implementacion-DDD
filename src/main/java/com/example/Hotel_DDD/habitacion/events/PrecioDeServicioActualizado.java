package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.ServicioID;

public class PrecioDeServicioActualizado extends DomainEvent {
    private final ServicioID servicioID;
    private final Precio nuevoPrecio;

    public PrecioDeServicioActualizado(ServicioID servicioID, Precio nuevoPrecio) {
        super("sofka.habitacion.preciodeservicioactualizado");
        this.servicioID = servicioID;
        this.nuevoPrecio = nuevoPrecio;
    }

    public ServicioID getServicioID() {
        return servicioID;
    }

    public Precio getNuevoPrecio() {
        return nuevoPrecio;
    }
}
