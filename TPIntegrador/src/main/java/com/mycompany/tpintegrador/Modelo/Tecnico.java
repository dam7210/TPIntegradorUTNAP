package com.mycompany.tpintegrador.Modelo;
import java.util.List;
import lombok.Data;
@Data
public class Tecnico {
    private List<Especialidad> especialidades;
    private List<TiempoEstimado> tiemposEstimados;
    private List<MedioNotificacion> mediosNotificacion;
}
