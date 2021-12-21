package com.example.Hotel_DDD.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.reserva.values.ClienteID;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;

public class ClienteCambiado extends DomainEvent {

    private ClienteID entityId;
    private DatosPersonales datosPersonales;

    public ClienteCambiado(ClienteID entityId, DatosPersonales datosPersonales) {
        super("sofka.reserva.clientecambiado");
        this.entityId = entityId;
        this.datosPersonales = datosPersonales;
    }

    public ClienteID EntityId() {
        return entityId;
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }
}
