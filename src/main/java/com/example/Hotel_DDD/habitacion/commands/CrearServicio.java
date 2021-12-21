package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class CrearServicio extends Command {
    private final HabitacionID habitacionID;
    private final Tipo tipo;
    private final Precio precio;

    public CrearServicio(HabitacionID habitacionID, Tipo tipo, Precio precio) {
        this.habitacionID = habitacionID;
        this.tipo = tipo;
        this.precio = precio;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Precio getPrecio() {
        return precio;
    }
}
