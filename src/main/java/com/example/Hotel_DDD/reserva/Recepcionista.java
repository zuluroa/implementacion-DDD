package com.example.Hotel_DDD.reserva;

import co.com.sofka.domain.generic.Entity;
import com.example.Hotel_DDD.reserva.values.DatosPersonales;
import com.example.Hotel_DDD.reserva.values.Identificacion;
import com.example.Hotel_DDD.reserva.values.RecepcionistaID;

import java.util.Objects;

public class Recepcionista extends Entity<RecepcionistaID> {
    private Identificacion identificacion;
    private DatosPersonales datosPersonales;

    public Recepcionista(RecepcionistaID entityId, Identificacion identificacion, DatosPersonales datosPersonales) {
        super(entityId);
        this.identificacion = Objects.requireNonNull(identificacion);
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void AgregarDatosPersonales(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void ActualizarDatosPersonales(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public Identificacion Identificacion() {
        return identificacion;
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }
}
