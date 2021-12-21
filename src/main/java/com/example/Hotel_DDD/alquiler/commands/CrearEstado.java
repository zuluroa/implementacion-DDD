package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.Estado;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;

public class CrearEstado extends Command {
    private final AlquilerID alquilerID;
    private final Estado estado;

    public CrearEstado(AlquilerID alquilerID, Estado estado) {
        this.alquilerID = alquilerID;
        this.estado = estado;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public Estado getEstado() {
        return estado;
    }
}
