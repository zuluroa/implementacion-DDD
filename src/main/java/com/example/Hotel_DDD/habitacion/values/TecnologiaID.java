package com.example.Hotel_DDD.habitacion.values;

import co.com.sofka.domain.generic.Identity;
import com.example.Hotel_DDD.reserva.values.ReservaID;

public class TecnologiaID extends Identity {
    public TecnologiaID() {
    }

    private TecnologiaID(String id){
        super(id);
    }

    public static TecnologiaID of(String id){
        return new TecnologiaID(id);
    }
}
