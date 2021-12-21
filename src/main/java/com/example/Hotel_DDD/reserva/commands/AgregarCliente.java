package com.example.Hotel_DDD.reserva.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.reserva.values.ClienteID;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;
import com.example.Hotel_DDD.reserva.values.Identificacion;
import com.example.Hotel_DDD.reserva.values.ReservaID;

public class AgregarCliente extends Command {

    private final ReservaID reservaID;
    private final ClienteID clienteID;
    private final Identificacion identificacion;
    private final DatosPersonales datosPersonales;

    public AgregarCliente(ReservaID reservaID,ClienteID clienteID, Identificacion identificacion, DatosPersonales datosPersonales) {
        this.reservaID = reservaID;
        this.clienteID = clienteID;
        this.identificacion = identificacion;
        this.datosPersonales = datosPersonales;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
