package com.example.Hotel_DDD.alquiler;

import co.com.sofka.domain.generic.Entity;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.generic.Fecha;

import java.util.Objects;

public class Entrega extends Entity<EntregaID> {

    private Fecha fecha;

    public Entrega(EntregaID entityId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
    }

    public void actualizarFecha(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }

    public Fecha getFecha() {
        return fecha;
    }
}
