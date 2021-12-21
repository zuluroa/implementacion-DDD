package com.example.Hotel_DDD.habitacion.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.habitacion.Servicio;
import com.example.Hotel_DDD.habitacion.Tecnologia;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

import java.util.Set;

public class CrearHabitacion extends Command {
    private final int CupoMaximo;
    private final Double PrecioTotal;
    private final HabitacionID habitacionID;

    public CrearHabitacion(int cupoMaximo, Double precioTotal, HabitacionID habitacionID) {
        CupoMaximo = cupoMaximo;
        PrecioTotal = precioTotal;
        this.habitacionID = habitacionID;
    }

    public int getCupoMaximo() {
        return CupoMaximo;
    }

    public Double getPrecioTotal() {
        return PrecioTotal;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }
}
