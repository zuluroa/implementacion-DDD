package com.example.Hotel_DDD.reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatosPersonales implements ValueObject<DatosPersonales.Properties> {
    private final String nombres;
    private final String apellidos;
    private final String ciudad;
    private final String telefono;
    private final String direccion;
    private final String email;

    public DatosPersonales(String nombres, String apellidos, String ciudad, String telefono, String direccion, String email) {
        this.nombres = Objects.requireNonNull(nombres);
        this.apellidos = Objects.requireNonNull(apellidos);
        this.ciudad = Objects.requireNonNull(ciudad);
        this.telefono = Objects.requireNonNull(telefono);
        this.direccion = Objects.requireNonNull(direccion);
        this.email = Objects.requireNonNull(email);
        if(this.nombres.isBlank()) throw new IllegalArgumentException("Los nombres no puede estar vacio");
        if(mayorOIgualA(this.nombres.length(),5))throw new IllegalArgumentException("Los nombres  debe de tener minimo 5 caracteres");
        if(this.apellidos.isBlank()) throw new IllegalArgumentException("Los apellidos no puede estar vacio");
        if(mayorOIgualA(this.apellidos.length(),5))throw new IllegalArgumentException("Los apellidos  debe de tener minimo 5 caracteres");
        if(this.ciudad.isBlank()) throw new IllegalArgumentException("La ciudad no puede estar vacio");
        if(mayorOIgualA(this.ciudad.length(), 5))throw new IllegalArgumentException("La ciudad   debe de tener minimo 5 caracteres");
        if(this.telefono.isBlank()) throw new IllegalArgumentException("El telefono no puede estar vacio");
        if(mayorOIgualA(this.telefono.length(), 10))throw new IllegalArgumentException("El telefono debe de tener minimo 10 caracteres");
        if(this.direccion.isBlank()) throw new IllegalArgumentException("La direccion no puede estar vacio");
        if(mayorOIgualA(this.direccion.length() ,10))throw new IllegalArgumentException("La direccion  debe de tener minimo 10 caracteres");
        if(this.email.isBlank()) throw new IllegalArgumentException("El correo eleectronico no puede estar vacio");

        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        if(!pattern.matcher(email).find())throw new IllegalArgumentException("Debes ingresar un correo eleectronico valido");
    }

    private Boolean mayorOIgualA(int datosize, int comparador){
        if (datosize >= comparador) return  true;
            return false;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String Nombres() {
                return nombres;
            }

            @Override
            public String Apellidos() {
                return apellidos;
            }

            @Override
            public String Ciudad() {
                return ciudad;
            }

            @Override
            public String Telefono() {
                return telefono;
            }

            @Override
            public String Direccion() {
                return direccion;
            }

            @Override
            public String Email() {
                return email;
            }
        };
    }

    public interface  Properties {
        String Nombres();
        String Apellidos();
        String Ciudad();
        String Telefono();
        String Direccion();
        String Email();
    }

}
