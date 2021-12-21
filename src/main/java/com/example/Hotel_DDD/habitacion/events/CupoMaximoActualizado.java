package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class CupoMaximoActualizado extends DomainEvent {

    private final HabitacionID habitacionID;
    private final int cupoMaximoActualizado;

    public CupoMaximoActualizado(HabitacionID habitacionID, int cupoMaximoActualizado) {
        super("sofka.habitacion.cupomaximoactualizado");
        this.habitacionID = habitacionID;
        this.cupoMaximoActualizado = cupoMaximoActualizado;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public int getCupoMaximoActualizado() {
        return cupoMaximoActualizado;
    }
}
