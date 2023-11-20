package com.mycompany.tpintegrador.Modelo;

import java.util.List;
import lombok.Data;
@Data
public class Servicio {private String nombre; 
    private String descripcion;  
    private List<TipoProblema> tiposProblemaSoportados;  
    private List<Especialidad> especialidadesSoportadas;
}

