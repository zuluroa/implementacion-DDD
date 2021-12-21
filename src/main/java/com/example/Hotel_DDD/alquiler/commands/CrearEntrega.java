package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.generic.Fecha;

public class CrearEntrega extends Command {

    private final AlquilerID alquilerID;
    private final Fecha fecha;

    public CrearEntrega(AlquilerID alquilerID, Fecha fecha) {
        this.alquilerID = alquilerID;
        this.fecha = fecha;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
