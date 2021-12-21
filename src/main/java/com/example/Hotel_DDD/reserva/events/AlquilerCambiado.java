package com.example.Hotel_DDD.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;

public class AlquilerCambiado extends DomainEvent {

    private AlquilerID alquilerID;

    public AlquilerCambiado(AlquilerID alquilerID) {
        super("sofka.reserva.alquilercambiado");
        this.alquilerID = alquilerID;
    }

    public AlquilerID AlquilerID() {
        return alquilerID;
    }
}
