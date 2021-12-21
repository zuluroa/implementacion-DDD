package com.example.Hotel_DDD.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Observaciones implements ValueObject<String> {
    private final String value;

    public Observaciones(String observacion) {
        this.value = Objects.requireNonNull(observacion, "Las observaciones no puede ser nulo");
        if(this.value.isBlank())throw new IllegalArgumentException("Las observaciones no puede ser vacio");
        if(this.value.length() > 1) throw new IllegalArgumentException("Las observaciones ser mayor de 1 caracteres");
    }

    public String value() {
        return value;
    }
}
