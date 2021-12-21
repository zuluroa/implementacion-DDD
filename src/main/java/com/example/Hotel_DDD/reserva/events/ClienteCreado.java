package com.example.Hotel_DDD.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.reserva.values.ClienteID;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;
import com.example.Hotel_DDD.reserva.values.Identificacion;

public class ClienteCreado extends DomainEvent {

    private ClienteID clienteID;
    private Identificacion identificacion;
    private DatosPersonales datosPersonales;

    public ClienteCreado(ClienteID clienteID, Identificacion identificacion, DatosPersonales datosPersonales) {
        super("sofka.reserva.clientecreado");
        this.clienteID = clienteID;
        this.identificacion = identificacion;
        this.datosPersonales = datosPersonales;
    }

    public ClienteID ClienteID() {
        return clienteID;
    }

    public Identificacion Identificacion() {
        return identificacion;
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }
}
