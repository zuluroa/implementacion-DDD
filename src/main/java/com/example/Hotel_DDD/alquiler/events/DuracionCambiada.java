package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.Duracion;

import java.util.Objects;

public class DuracionCambiada extends DomainEvent {
    private final AlquilerID alquilerID;
    private final Duracion nuevaDuracion;

    public DuracionCambiada(AlquilerID alquilerID, Duracion nuevaDuracion) {
        super("sofka.alquiler.entregacreada");
        this.alquilerID = Objects.requireNonNull(alquilerID);
        this.nuevaDuracion = Objects.requireNonNull(nuevaDuracion);
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public Duracion getNuevaDuracion() {
        return nuevaDuracion;
    }
}
