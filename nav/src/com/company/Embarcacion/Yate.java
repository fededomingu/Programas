package com.company.Embarcacion;

import com.company.Capitan;

public class Yate extends Embarcacion implements Comparable{
    public Integer cantidaCamarote;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double slora, Integer cantidaCamarote) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, slora);
        this.cantidaCamarote = cantidaCamarote;
    }

    @Override
    public int compareTo(Object yat) {
        Yate unyate = (Yate) yat;
        if (this.cantidaCamarote > unyate.cantidaCamarote){
            return 1;}
        if (this.cantidaCamarote < unyate.cantidaCamarote){
            return -1;}
            return 0;
        }
}
