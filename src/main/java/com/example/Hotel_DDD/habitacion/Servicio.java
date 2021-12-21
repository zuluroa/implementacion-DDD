package com.example.Hotel_DDD.habitacion;

import co.com.sofka.domain.generic.Entity;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.ServicioID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

import java.util.Objects;


public class Servicio  extends Entity<ServicioID> {

    private final Tipo tipo;
    private final Precio precio;

    public Servicio(ServicioID servicioID, Tipo tipo, Precio precio) {
        super(servicioID);
        this.tipo = Objects.requireNonNull(tipo);
        this.precio = Objects.requireNonNull(precio);
    }

    public Tipo Tipo() {
        return tipo;
    }

    public Precio Precio() {
        return precio;
    }
}
