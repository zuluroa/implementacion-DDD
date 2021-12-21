package com.example.Hotel_DDD.alquiler;

import co.com.sofka.domain.generic.Entity;
import com.example.Hotel_DDD.alquiler.values.EstadoID;
import com.example.Hotel_DDD.alquiler.values.Observaciones;

import java.util.Objects;

public class Estado extends Entity<EstadoID> {
    private Observaciones observaciones;

    public Estado(EstadoID entityId, Observaciones observaciones) {
        super(entityId);
        this.observaciones = observaciones;
    }

    public void actualizarObservaciones(Observaciones observaciones){
        this.observaciones = Objects.requireNonNull(observaciones);
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }
}
