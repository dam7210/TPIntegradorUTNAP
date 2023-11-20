package com.mycompany.tpintegrador.Modelo;
public enum Especialidad {
    SAP("SAP"),
    WINDOWS("Windows"),
    LINUX("Linux"),
    MACOS("MacOS"),
    OTRO("Otro");

    private final String descripcion;

    Especialidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


