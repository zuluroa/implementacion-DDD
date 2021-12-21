package com.example.Hotel_DDD.habitacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.habitacion.values.ServicioID;

public class ServicioCambiado extends DomainEvent {
    private final ServicioID oldservicio;
    private final ServicioID newservicio;

    public ServicioCambiado(ServicioID oldservicio, ServicioID newservicio) {
        super("sofka.habitacion.serviciocambiado");
        this.oldservicio = oldservicio;
        this.newservicio = newservicio;
    }

    public ServicioID getOldservicio() {
        return oldservicio;
    }

    public ServicioID getNewservicio() {
        return newservicio;
    }
}
