package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.generic.Fecha;

public class FechaDeEntregaActualizada extends DomainEvent {
    private final EntregaID habitacionID;
    private final Fecha nuevaFecha;

    public FechaDeEntregaActualizada(EntregaID habitacionID, Fecha nuevaFecha) {
        super("sofka.alquiler.fechaDeentregaactualizada");
        this.habitacionID = habitacionID;
        this.nuevaFecha = nuevaFecha;
    }

    public EntregaID getHabitacionID() {
        return habitacionID;
    }

    public Fecha getNuevaFecha() {
        return nuevaFecha;
    }
}
