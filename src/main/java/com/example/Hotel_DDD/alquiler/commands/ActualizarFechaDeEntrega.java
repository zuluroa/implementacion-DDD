package com.example.Hotel_DDD.alquiler.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.generic.Fecha;

public class ActualizarFechaDeEntrega extends Command {
    private final AlquilerID alquilerID;
    private final EntregaID entregaID;
    private final Fecha nuevaFecha;

    public ActualizarFechaDeEntrega(AlquilerID alquilerID, EntregaID entregaID, Fecha nuevaFecha) {
        this.alquilerID = alquilerID;
        this.entregaID = entregaID;
        this.nuevaFecha = nuevaFecha;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public EntregaID getEntregaID() {
        return entregaID;
    }

    public Fecha getNuevaFecha() {
        return nuevaFecha;
    }
}
