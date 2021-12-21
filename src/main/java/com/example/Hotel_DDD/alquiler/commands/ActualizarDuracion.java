package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.Duracion;

public class ActualizarDuracion extends Command {
    private final AlquilerID alquilerID;
    private final Duracion nuevaDuracion;

    public ActualizarDuracion(AlquilerID alquilerID, Duracion nuevaDuracion) {
        this.alquilerID = alquilerID;
        this.nuevaDuracion = nuevaDuracion;
    }


    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public Duracion getNuevaDuracion() {
        return nuevaDuracion;
    }
}
