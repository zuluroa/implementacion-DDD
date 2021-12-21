package com.example.Hotel_DDD.reserva;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Hotel_DDD.alquiler.values.AlquilerID;
import com.example.Hotel_DDD.alquiler.values.Duracion;
import com.example.Hotel_DDD.alquiler.values.EntregaID;
import com.example.Hotel_DDD.alquiler.values.EstadoID;
import com.example.Hotel_DDD.generic.Fecha;
import com.example.Hotel_DDD.reserva.events.*;
import com.example.Hotel_DDD.reserva.values.*;

import java.util.List;
import java.util.Objects;

public class Reserva extends AggregateEvent<ReservaID> {

    protected Fecha fecha;
    protected AlquilerID alquilerID;
    protected RecepcionistaID recepcionistaID;
    protected ClienteID clienteID;
    protected ReservaID reservaID;

    public Reserva(ReservaID reservaID) {
        super(reservaID);
        subscribe( new ReservaChange(this));
    }

    public Reserva(ReservaID reservaID, ClienteID clienteID, RecepcionistaID recepcionistaID, AlquilerID alquilerID, Fecha fecha) {
        super(reservaID);
        appendChange(new ReservaCreada(clienteID,recepcionistaID,alquilerID,fecha)).apply();
    }

    public static Reserva from(ReservaID reservaID, List<DomainEvent> events){
        var reserva = new Reserva(reservaID);
        events.forEach(reserva::applyEvent);
        return reserva;
    }

    public void agregarCliente(ClienteID clienteID, Identificacion identificacion, DatosPersonales datosPersonales){
        Objects.requireNonNull(clienteID, "El ID de cliente es requerido");
        Objects.requireNonNull(identificacion, "La identificacion del cliente es requerida");
        Objects.requireNonNull(datosPersonales, "Los datos del cliente son requeridos");
        appendChange( new ClienteCreado(clienteID,identificacion,datosPersonales)).apply();
    }

    public void actualizarDatosPersonalesDeCliente(ClienteID clienteID, DatosPersonales datosPersonales){
        Objects.requireNonNull(clienteID, "El ID de cliente es requerido");
        Objects.requireNonNull(datosPersonales, "Los datos del cliente son requeridos");
        appendChange( new ClienteCambiado(clienteID,datosPersonales)).apply();
    }

    public void agregarRecepcionista(RecepcionistaID recepcionistaID, Identificacion identificacion, DatosPersonales datosPersonales){
        Objects.requireNonNull(recepcionistaID, "El ID de recepccionista es requerido");
        Objects.requireNonNull(identificacion, "La identificacion del recepccionista es requerida");
        Objects.requireNonNull(datosPersonales, "Los datos del recepccionista son requeridos");
        appendChange( new RecepcionistaCreado(recepcionistaID,identificacion,datosPersonales)).apply();
    }

    public void crearAlquiler(AlquilerID alquilerID, EntregaID entregaID, EstadoID estadoID, Duracion duracion){
        Objects.requireNonNull(alquilerID,"El ID de alquiler es requerido");
        Objects.requireNonNull(entregaID, "El ID de entrega es requerido");
        Objects.requireNonNull(estadoID, "El ID de estado es requerido");
        Objects.requireNonNull(duracion, "La duración es requerida");
        appendChange( new AlquilerCreado(alquilerID, entregaID, estadoID, duracion)).apply();
    }

    public void cambiarAlquiler(AlquilerID alquilerID){
        Objects.requireNonNull(alquilerID,"El ID de alquiler es requerido");
        appendChange( new AlquilerCambiado(alquilerID)).apply();
    }

    public Fecha getFecha() {
        return fecha;
    }

    public AlquilerID AlquilerID() {
        return alquilerID;
    }

    public RecepcionistaID RecepcionistaID() {
        return recepcionistaID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }
}
