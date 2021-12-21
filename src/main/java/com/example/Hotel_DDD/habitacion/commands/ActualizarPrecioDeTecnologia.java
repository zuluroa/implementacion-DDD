package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.ServicioID;

public class ActualizarPrecioDeTecnologia extends Command {
    private final HabitacionID habitacionID;
    private final ServicioID servicioID;
    private final Precio nuevoPrecio;

    public ActualizarPrecioDeTecnologia(HabitacionID habitacionID, ServicioID servicioID, Precio nuevoPrecio) {
        this.habitacionID = habitacionID;
        this.servicioID = servicioID;
        this.nuevoPrecio = nuevoPrecio;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public ServicioID getServicioID() {
        return servicioID;
    }

    public Precio getNuevoPrecio() {
        return nuevoPrecio;
    }
}
