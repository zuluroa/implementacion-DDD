package com.example.Hotel_DDD.reserva.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;
import com.example.Hotel_DDD.reserva.values.Identificacion;
import com.example.Hotel_DDD.reserva.values.RecepcionistaID;
import com.example.Hotel_DDD.reserva.values.ReservaID;

public class AgregarRecepcionista extends Command {

    private final ReservaID reservaID;
    private final RecepcionistaID entityId;
    private final Identificacion identificacion;
    private final DatosPersonales datosPersonales;

    public AgregarRecepcionista(ReservaID reservaID, RecepcionistaID entityId, Identificacion identificacion, DatosPersonales datosPersonales){
        this.reservaID = reservaID;
        this.entityId = entityId;
        this.identificacion = identificacion;
        this.datosPersonales = datosPersonales;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public RecepcionistaID getEntityId() {
        return entityId;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
