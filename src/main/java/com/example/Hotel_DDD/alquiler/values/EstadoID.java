package com.example.Hotel_DDD.alquiler.values;

import co.com.sofka.domain.generic.Identity;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class EstadoID extends Identity {
    public EstadoID() {
    }

    private EstadoID(String id){
        super(id);
    }

    public static EstadoID of(String id){
        return new EstadoID(id);
    }
}
