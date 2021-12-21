package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class TecnologiaCreada extends DomainEvent {
    private final TecnologiaID tecnologiaID;
    private final Tipo tipo;
    private final Precio precio;

    public TecnologiaCreada(TecnologiaID tecnologiaID, Tipo tipo, Precio precio) {
        super("sofka.habitacion.tecnologiacreada");
        this.tecnologiaID = tecnologiaID;
        this.tipo = tipo;
        this.precio = precio;
    }

    public TecnologiaID getTecnologiaID() {
        return tecnologiaID;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Precio getPrecio() {
        return precio;
    }
}
