package com.company.Embarcacion;

import com.company.Capitan;

public class Velero extends Embarcacion{
    private Integer cantidaMastil;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double slora, Integer cantidaMastil) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, slora);
        this.cantidaMastil = cantidaMastil;
    }
    public Boolean esGrande() {
        return cantidaMastil > 4;
    }
}
