package com.example.Hotel_DDD.habitacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {
    private final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value, "El tipo no puede ser nulo");
        if(this.value.isBlank())throw new IllegalArgumentException("El tipo no puede ser vacio");
        if(this.value.length() > 2) throw new IllegalArgumentException("El tipo debe ser mayor de 2 caracteres");
    }

    public String value() {
        return value;
    }
}
