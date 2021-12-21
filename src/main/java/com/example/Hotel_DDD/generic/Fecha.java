package com.example.Hotel_DDD.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Fecha implements ValueObject<String> {
    private final String value;

    public Fecha(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(fecha, fecha.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
