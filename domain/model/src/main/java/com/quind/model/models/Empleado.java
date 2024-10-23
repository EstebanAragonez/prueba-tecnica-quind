package com.quind.model.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    private Documento tipoDocumento;
    private String numeroDocumento;
    private String area;
    private String nombreCompleto;

}
