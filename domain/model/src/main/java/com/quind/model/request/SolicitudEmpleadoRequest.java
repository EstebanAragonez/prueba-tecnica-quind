package com.quind.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SolicitudEmpleadoRequest {

    private String tipoDocumento;

    private String numeroDocumento;

    private String tipoSolicitudId;

    private Date fechaDeseada;

    private String comentarios;
}
