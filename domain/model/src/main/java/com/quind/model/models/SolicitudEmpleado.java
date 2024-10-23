package com.quind.model.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudEmpleado {

    private Long idSolicitudEmpleado;
    private TipoSolicitud tipoSolicitud;
    private Documento documento;
    private String numeroDocumento;
    private String nombreEmpleado;
    private Date fechaSolicitud;
    private String estado;
    private String comentarios;

}
