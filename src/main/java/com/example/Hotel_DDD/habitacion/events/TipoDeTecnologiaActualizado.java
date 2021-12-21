package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;
import com.example.Hotel_DDD.habitacion.values.Tipo;

public class TipoDeTecnologiaActualizado extends DomainEvent {
    private final TecnologiaID tecnologiaID;
    private final Tipo nuevoTipo;

    public TipoDeTecnologiaActualizado(TecnologiaID tecnologiaID, Tipo nuevoTipo) {
        super("sofka.habitacion.tipodetecnologiaactualizado");
        this.tecnologiaID = tecnologiaID;
        this.nuevoTipo = nuevoTipo;
    }

    public TecnologiaID getTecnologiaID() {
        return tecnologiaID;
    }

    public Tipo getNuevoTipo() {
        return nuevoTipo;
    }
}
