package com.example.Hotel_DDD.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.reserva.values.ClienteID;
import com.example.Hotel_DDD.generic.Fecha;
import com.example.Hotel_DDD.reserva.values.RecepcionistaID;

import java.util.Objects;

public class ReservaCreada extends DomainEvent {

    private final ClienteID clienteID;
    private final RecepcionistaID recepcionistaID;
    private final AlquilerID alquilerID;
    private final Fecha fecha;

    public ReservaCreada(ClienteID clienteID, RecepcionistaID recepcionistaID, AlquilerID alquilerID, Fecha fecha) {
        super("sofka.reserva.reservacreada");
        this.fecha = Objects.requireNonNull(fecha, "La fecha no puede ser nula");
        this.alquilerID = Objects.requireNonNull(alquilerID, "El ID de alquiiler es requerido");
        this.recepcionistaID = Objects.requireNonNull(recepcionistaID, "El ID de recepcionista es requerido");
        this.clienteID = Objects.requireNonNull(clienteID, "El ID de cliente es requerido");
    }


    public Fecha Fecha() {
        return fecha;
    }

    public ClienteID ClienteID() {
        return clienteID;
    }

    public RecepcionistaID RecepcionistaID() {
        return recepcionistaID;
    }

    public AlquilerID AlquilerID() {
        return alquilerID;
    }
}
