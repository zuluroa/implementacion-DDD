package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.Estado;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.EstadoID;

public class ActualizarObservacionesDeEstado extends Command {

    private final AlquilerID alquilerID;
    private final EstadoID estadoID;
    private final Estado estado;

    public ActualizarObservacionesDeEstado(AlquilerID alquilerID, EstadoID estadoID, Estado estado) {
        this.alquilerID = alquilerID;
        this.estadoID = estadoID;
        this.estado = estado;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public EstadoID getEstadoID() {
        return estadoID;
    }

    public Estado getEstado() {
        return estado;
    }
}
