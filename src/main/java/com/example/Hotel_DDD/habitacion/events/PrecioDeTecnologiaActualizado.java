package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;

public class PrecioDeTecnologiaActualizado extends DomainEvent {
    private final TecnologiaID tecnologiaID;
    private final Precio nuevoPrecio;

    public PrecioDeTecnologiaActualizado(TecnologiaID tecnologiaID, Precio nuevoPrecio) {
        super("sofka.habitacion.preciodetecnologiaactualizado");
        this.tecnologiaID = tecnologiaID;
        this.nuevoPrecio = nuevoPrecio;
    }

    public TecnologiaID getTecnologiaID() {
        return tecnologiaID;
    }

    public Precio getNuevoPrecio() {
        return nuevoPrecio;
    }
}
