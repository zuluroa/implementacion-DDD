package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class CrearHabitacion extends Command {

    private final AlquilerID alquilerID;
    private final int cupoMaximo;
    private final Double precioTotal;
    private final HabitacionID habitacionID;

    public CrearHabitacion(AlquilerID alquilerID, int cupoMaximo, Double precioTotal, HabitacionID habitacionID) {
        this.alquilerID = alquilerID;
        this.cupoMaximo = cupoMaximo;
        this.precioTotal = precioTotal;
        this.habitacionID = habitacionID;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public HabitacionID getHabitacionID() {
        return habitacionID;
    }
}
