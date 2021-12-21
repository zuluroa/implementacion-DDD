package com.example.Hotel_DDD.alquiler.commands;

import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;

public class CambiarHabitacion {

    private final AlquilerID alquilerID;
    private final HabitacionID oldhabitacionID;
    private final HabitacionID newhabitacionID;

    public CambiarHabitacion(AlquilerID alquilerID, HabitacionID oldhabitacionID, HabitacionID newhabitacionID) {
        this.alquilerID = alquilerID;
        this.oldhabitacionID = oldhabitacionID;
        this.newhabitacionID = newhabitacionID;
    }

    public AlquilerID getAlquilerID() {
        return alquilerID;
    }

    public HabitacionID getOldhabitacionID() {
        return oldhabitacionID;
    }

    public HabitacionID getNewhabitacionID() {
        return newhabitacionID;
    }
}
