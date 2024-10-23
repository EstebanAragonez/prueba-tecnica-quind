package com.quind.model.outbound;

import com.quind.model.models.Empleado;

import java.util.Optional;

public interface EmpleadoPort {
    Optional<Empleado> findByTipoDocumentoAndNumeroDocumento(String tipoDocumento, String numeroDocumento);
}
