package com.example.Hotel_DDD.alquiler.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class HabitacionCreada extends DomainEvent {
    private final int cupoMaximo;
    private final Double precioTotal;

    public HabitacionCreada(int cupoMaximo, Double precioTotal) {
        super("sofka.alquiler.habitacioncreada");
        this.cupoMaximo = cupoMaximo;
        this.precioTotal = precioTotal;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }
}
