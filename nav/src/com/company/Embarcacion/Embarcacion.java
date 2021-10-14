package com.company.Embarcacion;

import com.company.Capitan;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double slora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double slora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.slora = slora;
    }
    public Double alquiler(){
        Double precioFinal = precioBase;
        if (anioFabricacion > 2020){
            precioFinal += valorAdicional;
        }
        return precioFinal;
    }
}
