package com.example.Hotel_DDD.reserva.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.reserva.values.ClienteID;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;
import com.example.Hotel_DDD.reserva.values.ReservaID;

public class ActualizarDatosPersonalesDeCliente extends Command {

    private final ReservaID reservaID;
    private final ClienteID clienteID;
    private final DatosPersonales datosPersonales;

    public ActualizarDatosPersonalesDeCliente(ReservaID reservaID,ClienteID clienteID, DatosPersonales datosPersonales) {
        this.reservaID = reservaID;
        this.clienteID = clienteID;
        this.datosPersonales = datosPersonales;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
