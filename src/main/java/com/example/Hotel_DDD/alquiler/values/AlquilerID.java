package com.example.Hotel_DDD.alquiler.values;

import co.com.sofka.domain.generic.Identity;

public class AlquilerID extends Identity {
    public AlquilerID() {
    }

    private AlquilerID(String id){
        super(id);
    }

    public static AlquilerID of(String id){
        return new AlquilerID(id);
    }
}
