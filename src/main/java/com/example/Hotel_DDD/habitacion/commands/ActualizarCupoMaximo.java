package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class ActualizarCupoMaximo extends Command {

    private final HabitacionID habitacionID;
    private final int cupoMaximoActualizado;

    public ActualizarCupoMaximo(HabitacionID habitacionID, int cupoMaximoActualizado) {
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
