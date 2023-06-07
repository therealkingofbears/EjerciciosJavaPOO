/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Residencia;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ResidenciaService {
    Scanner leer = new Scanner(System.in);
    Residencia r1 = new Residencia();

    public Residencia crearResidencia() {
        System.out.println("Ingrese el nombre de la residencia");
        r1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la dirección de la residencia");
        r1.setDireccion(leer.nextLine());
        
        System.out.println("Ingrese la localidad en donde se encuentra la residencia");
        r1.setLocalidad(leer.nextLine());
        
        System.out.println("Ingrese el nombre del gerente encargado de la residencia");
        r1.setGerente(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de habitaciones de la residencia");
        r1.setCantHab(leer.nextInt());
        
        System.out.println("Hay descuentos para los gremios?");
        r1.setDescGremio(leer.nextBoolean());
        
        System.out.println("Posee campo deportivo?");
        r1.setCampoDep(leer.nextBoolean());

        return new Residencia();
    }
}
