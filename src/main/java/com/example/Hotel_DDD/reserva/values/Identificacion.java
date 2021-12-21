package com.example.Hotel_DDD.reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Properties;

public class Identificacion implements ValueObject<Identificacion.Properties>{
    private final String tipoDeIdentificacion;
    private final String numeroDeIdentificacion;

    public Identificacion(String tipoDeIdentificacion, String numeroDeIdentificacion ) {
        this.tipoDeIdentificacion = Objects.requireNonNull(tipoDeIdentificacion);
        this.numeroDeIdentificacion = Objects.requireNonNull(numeroDeIdentificacion);

        if(this.numeroDeIdentificacion.isBlank()) throw new IllegalArgumentException("El numero de identificación no puede estar vacio");
        if(this.numeroDeIdentificacion.length() >= 10)throw new IllegalArgumentException("El numero de identificación debe de tener minimo 10 caracteres");
        if(this.tipoDeIdentificacion.isBlank()) throw new IllegalArgumentException("El tipo de identificación no puede estar vacio");
        if(this.tipoDeIdentificacion.length() >= 2)throw new IllegalArgumentException("El numero de identificación debe de tener minimo 2 caracteres");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String tipoDeIdentificacion() {
                return tipoDeIdentificacion;
            }

            @Override
            public String numeroDeIdentificacion() {
                return numeroDeIdentificacion;
            }
        };
    }
    public interface  Properties {
        String tipoDeIdentificacion();
        String numeroDeIdentificacion();
    }
}
