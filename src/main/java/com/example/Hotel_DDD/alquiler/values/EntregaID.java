package com.example.Hotel_DDD.alquiler.values;

import co.com.sofka.domain.generic.Identity;

public class EntregaID extends Identity {
    public EntregaID() {
    }

    private EntregaID(String id){
        super(id);
    }

    public static EntregaID of(String id){
        return new EntregaID(id);
    }
}
