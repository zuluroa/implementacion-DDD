package com.example.Hotel_DDD.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;
import com.example.Hotel_DDD.reserva.values.Identificacion;
import com.example.Hotel_DDD.reserva.values.RecepcionistaID;

public class RecepcionistaCreado extends DomainEvent {

    private RecepcionistaID entityId;
    private Identificacion identificacion;
    private DatosPersonales datosPersonales;

    public RecepcionistaCreado(RecepcionistaID entityId, Identificacion identificacion, DatosPersonales datosPersonales) {
        super("sofka.reserva.recepcionistacreado");
        this.entityId = entityId;
        this.identificacion = identificacion;
        this.datosPersonales = datosPersonales;
    }

    public RecepcionistaID EntityId() {
        return entityId;
    }

    public Identificacion Identificacion() {
        return identificacion;
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }
}

