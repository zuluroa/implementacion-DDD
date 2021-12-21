package com.example.Hotel_DDD.habitacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.events.HabitacionCreada;
import com.example.Hotel_DDD.habitacion.events.*;
import com.example.Hotel_DDD.habitacion.values.*;
import com.example.Hotel_DDD.reserva.Reserva;
import com.example.Hotel_DDD.reserva.ReservaChange;
import com.example.Hotel_DDD.reserva.values.ReservaID;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Habitacion extends AggregateEvent<HabitacionID> {

    protected Set<Servicio> servicio;
    protected Set<Tecnologia> tecnologia;
    protected int CupoMaximo;
    protected Double PrecioTotal;
    protected HabitacionID habitacionID;

    public Habitacion(HabitacionID habitacionID) {
        super(habitacionID);
        subscribe( new HabitacionChange(this));
    }

    public Habitacion(HabitacionID habitacionID, int cupoMaximo, Double precioTotal) {
        super(habitacionID);
        this.servicio = new HashSet<>();;
        this.tecnologia = new HashSet<>();;
        this.CupoMaximo = cupoMaximo;
        this.PrecioTotal = precioTotal;
        appendChange(new HabitacionCreada(cupoMaximo,precioTotal));
    }

    public static Habitacion from(HabitacionID habitacionID, List<DomainEvent> events){
        var habitacion = new Habitacion(habitacionID);
        events.forEach(habitacion::applyEvent);
        return habitacion;
    }

    public void actualizarCupoMaximo(HabitacionID habitacionID, int cupoMaximoActualizado){
        appendChange(new CupoMaximoActualizado(habitacionID,cupoMaximoActualizado)).apply();
    }

    public void crearServicio(Tipo tipo, Precio precio){
        var servicioID = new ServicioID();
        Objects.requireNonNull(servicioID);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(precio);
        servicio.add(new Servicio(servicioID,tipo,precio));
        appendChange(new ServicioCreado(servicioID,tipo,precio)).apply();
    }

    public void cambiarServicio(ServicioID OldservicioID,ServicioID NewservicioID){
        Objects.requireNonNull(OldservicioID);
        Objects.requireNonNull(NewservicioID);
        appendChange(new ServicioCambiado(OldservicioID,NewservicioID)).apply();
    }

    public void actualizarPrecioDeServicio(ServicioID servicioID,Precio nuevoPrecio){
        Objects.requireNonNull(servicioID);
        Objects.requireNonNull(nuevoPrecio);
        appendChange(new PrecioDeServicioActualizado(servicioID,nuevoPrecio)).apply();
    }

    public void actualizarTipoDeServicio(ServicioID servicioID,Tipo nuevoTipo){
        Objects.requireNonNull(servicioID);
        Objects.requireNonNull(nuevoTipo);
        appendChange(new TipoDeServicioActualizado(servicioID,nuevoTipo)).apply();
    }

    public void crearTecnologia(Tipo tipo, Precio precio){
        var tecnologiaID = new TecnologiaID();
        Objects.requireNonNull(tecnologiaID);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(precio);
        tecnologia.add(new Tecnologia(tecnologiaID,tipo,precio));
        appendChange(new TecnologiaCreada(tecnologiaID,tipo,precio)).apply();
    }

    public void cambiarTecnologia(TecnologiaID OldtecnologiaID, TecnologiaID NewtecnologiaID){
        Objects.requireNonNull(OldtecnologiaID);
        Objects.requireNonNull(NewtecnologiaID);
        appendChange(new TecnologiaCambiada(OldtecnologiaID,NewtecnologiaID)).apply();
    }

    public void actualizarPrecioDeTecnologia(TecnologiaID tecnologiaID,Precio nuevoPrecio){
        Objects.requireNonNull(tecnologiaID);
        Objects.requireNonNull(nuevoPrecio);
        appendChange(new PrecioDeTecnologiaActualizado(tecnologiaID,nuevoPrecio)).apply();
    }

    public void actualizarTipoDeTecnologia(TecnologiaID tecnologiaID,Tipo nuevoTipo){
        Objects.requireNonNull(tecnologiaID);
        Objects.requireNonNull(nuevoTipo);
        appendChange(new TipoDeTecnologiaActualizado(tecnologiaID,nuevoTipo)).apply();
    }

}
