package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.ServicioID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class ServicioCreado extends DomainEvent {
    private final ServicioID servicioID;
    private final Tipo tipo;
    private final Precio precio;

    public ServicioCreado(ServicioID servicioID, Tipo tipo, Precio precio) {
        super("sofka.habitacion.serviciocreado");
        this.servicioID = servicioID;
        this.tipo = tipo;
        this.precio = precio;
    }

    public ServicioID getServicioID() {
        return servicioID;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Precio getPrecio() {
        return precio;
    }
}
