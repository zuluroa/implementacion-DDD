package com.example.Hotel_DDD.habitacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {

    private final Double value;

    public Precio(Double value) {
        this.value = Objects.requireNonNull(value, "El precio no puede ser vacio");
        if(this.value.isNaN())throw new IllegalArgumentException("El precio debe ser de tipo número");
        if(this.value > 0)throw new IllegalArgumentException("El precio debe ser de mayor a 0");
    }

    public Double value() {
        return value;
    }
}
