package com.example.Hotel_DDD.reserva;

import co.com.sofka.domain.generic.EventChange;
import com.example.Hotel_DDD.reserva.events.*;

public class ReservaChange extends EventChange {
    public ReservaChange(Reserva reserva) {

        apply((ReservaCreada event) ->{
            reserva.clienteID = event.ClienteID();
            reserva.recepcionistaID = event.RecepcionistaID();
            reserva.alquilerID = event.AlquilerID();
            reserva.fecha = event.Fecha();
        });

        apply((AlquilerCreado event) ->{
            reserva.crearAlquiler(event.getAlquilerID(),event.getEntregaID(),event.getEstadoID(),event.getDuracion());
        });

        apply((AlquilerCambiado event) ->{
            reserva.cambiarAlquiler(event.AlquilerID());
        });

        apply((ClienteCreado event) -> {
            reserva.agregarCliente(event.ClienteID(),event.Identificacion(),event.DatosPersonales());
        });

        apply((ClienteCambiado event) -> {
            reserva.actualizarDatosPersonalesDeCliente(event.EntityId(),event.DatosPersonales());
        });

        apply((RecepcionistaCreado event) -> {
            reserva.agregarRecepcionista(event.EntityId(),event.Identificacion(),event.DatosPersonales());
        });

    }
}
