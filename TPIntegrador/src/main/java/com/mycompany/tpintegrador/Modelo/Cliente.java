package com.mycompany.tpintegrador.Modelo;
import java.util.List;
import lombok.Data;
@Data
public class Cliente {
    private String razonSocial;
    private String cuit;
    private List<Servicio> serviciosContratados;}
