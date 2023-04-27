/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Array;
import java.util.*;

/**
 *
 * @author diego
 */
public class ArrayServicio {
    Array sv = new Array();
    Scanner leer = new Scanner (System.in);
    
    public Array llenarArray() {
    String[] otroArry = new String[12];
    otroArry[0] = "Enero";
    otroArry[1] = "Febrero";
    otroArry[2] = "Marzo";
    otroArry[3] = "Abril";
    otroArry[4] = "Mayo";
    otroArry[5] = "Junio";
    otroArry[6] = "Julio";
    otroArry[7] = "Agosto";
    otroArry[8] = "Septiembre";
    otroArry[9] = "Octubre";
    otroArry[10] = "Noviembre";
    otroArry[11] = "Diciembre";
    
    sv.setArray(otroArry);
    return sv;
}
 
    public void adivinarMesSecreto(Array sv) {
    sv.setMesSecreto(sv.getArray()[9]);
    String mes = null;

    System.out.println("Ingrese un mes para adivinar si es el mes secreto");
    mes = leer.next();
    
    while (!mes.equalsIgnoreCase(sv.getMesSecreto())) {
         System.out.println("Ingresó el mes equivocado. Vuelva a intentarlo!");
         mes = leer.next();
    }

    if (mes.equalsIgnoreCase(sv.getMesSecreto())) {
        System.out.println("Adivinó el mes!");
    } 
    
}
    
}

