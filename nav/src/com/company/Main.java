package com.company;

import com.company.Embarcacion.Embarcacion;
import com.company.Embarcacion.Velero;
import com.company.Embarcacion.Yate;

public class Main {

    public static void main(String[] args) {
	Capitan capitan1 = new Capitan("Fede", "Dominguez", "650");
    Capitan capitan2 = new Capitan("Valeria", "Schreiber", "106");
    Yate yat1 = new Yate(capitan1, 15600.0, 2500.0, 2015, 35.6, 5);
    Yate yat2 = new Yate(capitan2, 25000.0, 3500.0, 2021, 74.2, 8);
    Velero vel1= new Velero(capitan1, 8500.0, 1500.0, 2019, 46.52, 5);
        System.out.println( yat1.alquiler());
        System.out.println(yat2.alquiler());
        if(yat1.compareTo(yat2) > 0 ){
            System.out.println("es mas lujoso el: yat1");
        }else if(yat1.compareTo(yat2) < 0){
            System.out.println("es mas lujoso el: yat2");
        }else{
            System.out.println("Son igual de lujosos.");
        }
        System.out.println(vel1.alquiler());
        System.out.println(vel1.esGrande());
    }
}
