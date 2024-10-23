package com.quind.model.outbound;

import com.quind.model.models.TipoSolicitud;

import java.util.Optional;

public interface TipoSolicitudPort {
    Optional<TipoSolicitud> findById(String tipoSolicitud);
}
