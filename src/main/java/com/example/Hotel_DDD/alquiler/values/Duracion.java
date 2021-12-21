package com.example.Hotel_DDD.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duracion implements ValueObject<Integer> {

    private final int duracion;

    public Duracion(int duracion) {
        this.duracion = Objects.requireNonNull(duracion);
        if (duracion < 0 ) throw new IllegalArgumentException("La duración debe ser mayor a 0");
    }

    @Override
    public Integer value() {
        return duracion;
    }
}
