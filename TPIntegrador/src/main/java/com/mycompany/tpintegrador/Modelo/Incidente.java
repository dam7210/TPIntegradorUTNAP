package com.mycompany.tpintegrador.Modelo;
import java.util.Date;
import lombok.Data;
@Data
public class Incidente {
    private Cliente cliente;
    private Servicio servicio;
    private String descripcionProblema;
    private TipoProblema tipoProblema;
    private EstadoIncidente estadoIncidente;
    private Tecnico tecnicoAsignado;
    private Date fechaCreacion;
    private Date fechaEstimadaResolucion;
    private String consideracionesResolucion;
}
