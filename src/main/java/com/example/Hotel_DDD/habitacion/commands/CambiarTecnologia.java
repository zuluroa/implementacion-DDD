package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;

public class CambiarTecnologia extends Command {
    private final HabitacionID habitacionID;
    private final TecnologiaID OldtecnologiaID;
    private final TecnologiaID NewtecnologiaID;

    public CambiarTecnologia(HabitacionID habitacionID, TecnologiaID oldtecnologiaID, TecnologiaID newtecnologiaID) {
        this.habitacionID = habitacionID;
        OldtecnologiaID = oldtecnologiaID;
        NewtecnologiaID = newtecnologiaID;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public TecnologiaID getOldtecnologiaID() {
        return OldtecnologiaID;
    }

    public TecnologiaID getNewtecnologiaID() {
        return NewtecnologiaID;
    }
}
