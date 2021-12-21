package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.generic.Fecha;

import java.util.Objects;

public class EntregaCreada extends DomainEvent {

    private Fecha fecha;

    public EntregaCreada(Fecha fecha) {
        super("sofka.alquiler.entregacreada");
        this.fecha = Objects.requireNonNull(fecha,"La fecha no puede estar nula");
    }

    public Fecha getFecha() {
        return fecha;
    }
}
