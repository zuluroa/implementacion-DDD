package com.example.Hotel_DDD.reserva.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.reserva.values.ClienteID;
import com.example.Hotel_DDD.generic.Fecha;
import com.example.Hotel_DDD.reserva.values.RecepcionistaID;
import com.example.Hotel_DDD.reserva.values.ReservaID;

public class CrearReserva extends Command {
    private final Fecha fecha;
    private final AlquilerID alquilerID;
    private final RecepcionistaID recepcionistaID;
    private final ClienteID clienteID;
    private final ReservaID reservaID;

    public CrearReserva(Fecha fecha, AlquilerID alquilerID, RecepcionistaID recepcionistaID, ClienteID clienteID, ReservaID reservaID) {
        this.fecha = fecha;
        this.alquilerID = alquilerID;
        this.recepcionistaID = recepcionistaID;
        this.clienteID = clienteID;
        this.reservaID = reservaID;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public RecepcionistaID getRecepcionistaID() {
        return recepcionistaID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }
}
