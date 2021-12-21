package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.Estado;
import com.example.Hotel_DDD.alquiler.values.EstadoID;

public class ObservacionesDeEstadoActualizada extends DomainEvent {
    private final EstadoID estadoID;
    private final Estado estado;

    public ObservacionesDeEstadoActualizada(EstadoID estadoID, Estado estado) {
        super("sofka.alquiler.observacionesdeestadoactualizada");
        this.estadoID = estadoID;
        this.estado = estado;
    }

    public EstadoID getEstadoID() {
        return estadoID;
    }

    public Estado getEstado() {
        return estado;
    }
}
