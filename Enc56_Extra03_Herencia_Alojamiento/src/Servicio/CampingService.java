/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Camping;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CampingService {
    Scanner leer = new Scanner(System.in);
    Camping c1 = new Camping();


    public Camping crearCamping() {
        System.out.println("Ingrese el nombre del camping");
        c1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la dirección del camping");
        c1.setDireccion(leer.nextLine());
        
        System.out.println("Ingrese la localidad en donde se encuentra el camping");
        c1.setLocalidad(leer.nextLine());
        
        System.out.println("Ingrese el nombre del gerente encargado del camping");
        c1.setGerente(leer.nextLine());
        
        System.out.println("Ingrese la capacidad máxima de carpas");
        c1.setMaxCarpas(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de baños");
        c1.setCantBanios(leer.nextInt());
        
        System.out.println("¿El camping posee restaurante en las instalaciones?");
        c1.setResto(leer.nextBoolean());

        return new Camping();
    }
}
