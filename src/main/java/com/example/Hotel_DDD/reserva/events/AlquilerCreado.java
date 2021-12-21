package com.example.Hotel_DDD.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.Duracion;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.alquiler.values.EstadoID;

import java.util.Objects;

public class AlquilerCreado extends DomainEvent {

    private AlquilerID alquilerID;
    private EntregaID entregaID;
    private final EstadoID estadoID;
    private final Duracion duracion;

    public AlquilerCreado(AlquilerID alquilerID, EntregaID entregaID, EstadoID estadoID, Duracion duracion) {
        super("sofka.reserva.alquiilercreado");
        this.alquilerID = Objects.requireNonNull(alquilerID,"El ID de alquiler es requerido");
        this.entregaID = Objects.requireNonNull(entregaID,"El ID de entrega es requerido");
        this.estadoID = Objects.requireNonNull(estadoID,"El ID de estado es requerido");
        this.duracion = Objects.requireNonNull(duracion,"La duración es requerida");
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public EntregaID getEntregaID() {
        return entregaID;
    }

    public EstadoID getEstadoID() {
        return estadoID;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
