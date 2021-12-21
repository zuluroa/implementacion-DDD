package com.example.Hotel_DDD.alquiler;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.events.*;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.Duracion;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.alquiler.values.EstadoID;
import com.example.Hotel_DDD.habitacion.Habitacion;
import com.example.Hotel_DDD.habitacion.values.HabitacionID;
import com.example.Hotel_DDD.reserva.events.AlquilerCreado;
import com.example.Hotel_DDD.generic.Fecha;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Alquiler extends AggregateEvent<AlquilerID> {

    protected Set<Habitacion> habitacion;
    protected EntregaID entregaID;
    protected EstadoID estadoID;
    protected Duracion duracion;
    protected AlquilerID alquilerID;

    public Alquiler(AlquilerID alquilerID) {
        super(alquilerID);
        subscribe( new AlquilerChange(this));
    }

    public Alquiler(AlquilerID entityId, EntregaID entregaID, EstadoID estadoID, Duracion duracion) {
        super(entityId);
        this.habitacion = new HashSet<>();;
        this.entregaID = Objects.requireNonNull(entregaID, "El ID de entrega es requerido");
        this.estadoID = Objects.requireNonNull(estadoID, "El ID de estado es requerido");
        this.duracion = Objects.requireNonNull(duracion, "La duración es requerida");
        appendChange(new AlquilerCreado(entityId,entregaID,estadoID,duracion));
    }

    public static Alquiler from(AlquilerID alquilerID, List<DomainEvent> events){
        var alquiler = new Alquiler(alquilerID);
        events.forEach(alquiler::applyEvent);
        return alquiler;
    }

    public void crearHabitacion(int cupoMaximo, Double precioTotal){
        var habitacionID = new HabitacionID();
        Objects.requireNonNull(habitacionID);
        Objects.requireNonNull(cupoMaximo);
        Objects.requireNonNull(precioTotal);
        appendChange(new HabitacionCreada(cupoMaximo,precioTotal)).apply();
    }

    public void CambiarHabitacion(HabitacionID oldhabitacionID, HabitacionID newhabitacionID){
        Objects.requireNonNull(oldhabitacionID);
        Objects.requireNonNull(newhabitacionID);
        appendChange(new HabitacionCambiada(oldhabitacionID,newhabitacionID)).apply();
    }
    public void CrearEntrega(Fecha fecha){
        Objects.requireNonNull(fecha);
        appendChange(new EntregaCreada(fecha));
    }
    public void ActualizarFechaDeEntrega(EntregaID entregaID, Fecha nuevaFecha){
        Objects.requireNonNull(entregaID);
        Objects.requireNonNull(nuevaFecha);
        appendChange(new FechaDeEntregaActualizada(entregaID,nuevaFecha)).apply();
    }
    public void ActualizarDuracion(AlquilerID alquilerID, Duracion nuevaDuracion){
        Objects.requireNonNull(alquilerID);
        Objects.requireNonNull(nuevaDuracion);
        appendChange(new DuracionCambiada(alquilerID,nuevaDuracion)).apply();
    }
    public void CrearEstado(Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new EstadoCreado(estado));
    }

    public void ActualizarObservacionesDeEstado(EstadoID estadoID, Estado estado){
        Objects.requireNonNull(estadoID);
        Objects.requireNonNull(estado);
        appendChange(new ObservacionesDeEstadoActualizada(estadoID,estado)).apply();
    }
}
