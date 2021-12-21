package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class ActualizarTipoDeTecnologia extends Command {
    private final HabitacionID habitacionID;
    private final  TecnologiaID tecnologiaID;
    private final  Tipo nuevoTipo;

    public ActualizarTipoDeTecnologia(HabitacionID habitacionID, TecnologiaID tecnologiaID, Tipo nuevoTipo) {
        this.habitacionID = habitacionID;
        this.tecnologiaID = tecnologiaID;
        this.nuevoTipo = nuevoTipo;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public TecnologiaID getTecnologiaID() {
        return tecnologiaID;
    }

    public Tipo getNuevoTipo() {
        return nuevoTipo;
    }
}
