package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.Estado;

public class EstadoCreado extends DomainEvent {
    private Estado estado;

    public EstadoCreado(Estado estado) {
        super("sofka.alquiler.estadocreado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
