package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.Duracion;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.alquiler.values.EstadoID;

public class CrearAlquiler extends Command {

    private final EntregaID entregaID;
    private final EstadoID estadoID;
    private final Duracion duracion;
    private final AlquilerID alquilerID;

    public CrearAlquiler(EntregaID entregaID, EstadoID estadoID, Duracion duracion, AlquilerID alquilerID) {
        this.entregaID = entregaID;
        this.estadoID = estadoID;
        this.duracion = duracion;
        this.alquilerID = alquilerID;
    }

    public EntregaID getEntregaID() {
        return entregaID;
    }

    public EstadoID getEstadoID() {
        return estadoID;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }
}
