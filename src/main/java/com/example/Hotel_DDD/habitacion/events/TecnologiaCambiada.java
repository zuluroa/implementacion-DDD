package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.TecnologiaID;

public class TecnologiaCambiada extends DomainEvent {
    private final TecnologiaID oldtecnologia;
    private final TecnologiaID newtecnologiaID;

    public TecnologiaCambiada(TecnologiaID oldtecnologia, TecnologiaID newtecnologiaID) {
        super("sofka.habitacion.tecnologiacambiada");
        this.oldtecnologia = oldtecnologia;
        this.newtecnologiaID = newtecnologiaID;
    }

    public TecnologiaID getOldtecnologia() {
        return oldtecnologia;
    }

    public TecnologiaID getNewtecnologiaID() {
        return newtecnologiaID;
    }
}
