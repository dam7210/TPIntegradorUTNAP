package com.mycompany.tpintegrador.Modelo;
public enum TiempoEstimado {
    ERROR_DE_SOFTWARE(4),
    PROBLEMA_DE_CONECTIVIDAD(3),
    PROBLEMA_DE_HARDWARE(5),
    PROBLEMA_DE_ACCESO(3),
    PROBLEMA_DE_SEGURIDAD(12),
    CONSULTA_GENERAL(1),
    PROBLEMA_DE_DESEMPENO(3),
    PROBLEMA_DE_CONFIGURACION(4),
    PROBLEMA_DE_INTEGRACION(48);


    private final int horasEstimadas;

    TiempoEstimado(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
}
