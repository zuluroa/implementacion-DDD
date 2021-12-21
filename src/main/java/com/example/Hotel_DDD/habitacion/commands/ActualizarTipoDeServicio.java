package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.habitacion.values.ServicioID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class ActualizarTipoDeServicio extends Command {
    private final HabitacionID habitacionID;
    private final ServicioID servicioID;
    private final Tipo nuevoTipo;

    public ActualizarTipoDeServicio(HabitacionID habitacionID, ServicioID servicioID, Tipo nuevoTipo) {
        this.habitacionID = habitacionID;
        this.servicioID = servicioID;
        this.nuevoTipo = nuevoTipo;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public ServicioID getServicioID() {
        return servicioID;
    }

    public Tipo getNuevoTipo() {
        return nuevoTipo;
    }
}
