package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class HabitacionCambiada extends DomainEvent {
    private final HabitacionID oldhabitacionID;
    private final HabitacionID newhabitacionID;

    public HabitacionCambiada(HabitacionID oldhabitacionID, HabitacionID newhabitacionID) {
        super("sofka.alquiler.habitacioncambiada");
        this.oldhabitacionID = oldhabitacionID;
        this.newhabitacionID = newhabitacionID;
    }

    public HabitacionID getOldhabitacionID() {
        return oldhabitacionID;
    }

    public HabitacionID getNewhabitacionID() {
        return newhabitacionID;
    }
}
