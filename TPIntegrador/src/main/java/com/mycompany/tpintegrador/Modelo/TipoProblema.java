package com.mycompany.tpintegrador.Modelo;
public enum TipoProblema {
    ERROR_DE_SOFTWARE("Error de Software"),
    PROBLEMA_DE_CONECTIVIDAD("Problema de Conectividad"),
    PROBLEMA_DE_HARDWARE("Problema de Hardware"),
    PROBLEMA_DE_ACCESO("Problema de Acceso"),
    PROBLEMA_DE_SEGURIDAD("Problema de Seguridad"),
    CONSULTA_GENERAL("Consulta General"),
    PROBLEMA_DE_DESEMPENO("Problema de Desempeño"),
    PROBLEMA_DE_CONFIGURACION("Problema de Configuración"),
    PROBLEMA_DE_INTEGRACION("Problema de Integración");

    private final String descripcion;

    TipoProblema(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


