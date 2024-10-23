package com.quind.model.outbound;

import com.quind.model.models.SolicitudEmpleado;

public interface DocumentoPort {
    SolicitudEmpleado crearSolicitud (SolicitudEmpleado solicitudEmpleado);
}
