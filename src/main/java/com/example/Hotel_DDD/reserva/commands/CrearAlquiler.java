package com.example.Hotel_DDD.reserva.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.reserva.values.ReservaID;

public class CrearAlquiler extends Command {

    private final ReservaID reservaID;
    private final AlquilerID entityId;

    public CrearAlquiler(ReservaID reservaID, AlquilerID entityId){
        this.reservaID = reservaID;
        this.entityId = entityId;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public AlquilerID getEntityId() {
        return entityId;
    }
}
