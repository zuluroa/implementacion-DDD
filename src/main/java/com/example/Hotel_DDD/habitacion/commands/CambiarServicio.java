package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.habitacion.values.ServicioID;

public class CambiarServicio extends Command {
    private final HabitacionID habitacionID;
    private final ServicioID OldservicioID;
    private final ServicioID NewservicioID;

    public CambiarServicio(HabitacionID habitacionID, ServicioID oldservicioID, ServicioID newservicioID) {
        this.habitacionID = habitacionID;
        OldservicioID = oldservicioID;
        NewservicioID = newservicioID;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public ServicioID getOldservicioID() {
        return OldservicioID;
    }

    public ServicioID getNewservicioID() {
        return NewservicioID;
    }
}
