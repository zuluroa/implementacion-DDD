package com.example.Hotel_DDD.habitacion;

import co.com.sofka.domain.generic.Entity;
import com.example.Hotel_DDD.habitacion.values.Precio;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

import java.util.Objects;

public class Tecnologia extends Entity<TecnologiaID> {

    private final Tipo tipo;
    private final Precio precio;

    public Tecnologia(TecnologiaID tecnologiaID, Tipo tipo, Precio precio) {
        super(tecnologiaID);
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
