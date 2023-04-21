/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc21_ej2_nespresso;

import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc21_Ej2_Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio caf = new CafeteraServicio();
        Scanner leer = new Scanner(System.in);
        
        
        caf.capacidadMaxima();
        System.out.println("La capacidad máxima de la cafetera es de " + caf.capacidadMaxima() + " ml");
        
        System.out.println("Ingrese un número con la acción que quiera realizar de acuerdo al menú"); 
        System.out.println("1. Llenar la cafetera");
        System.out.println("2. Servir en taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar café");
        System.out.println("5. Salir");
        
        int opc = leer.nextInt();
        
        do {
            switch (opc) {
                case 1:
                    caf.llenarCafetera();
                    System.out.println("Ingrese un número con la acción que quiera realizar de acuerdo al menú"); 
                    System.out.println("1. Llenar la cafetera");
                    System.out.println("2. Servir en taza");
                    System.out.println("3. Vaciar cafetera");
                    System.out.println("4. Agregar café");
                    System.out.println("5. Salir");
        
                    opc = leer.nextInt();
                  break;
                case 2:
                    caf.servirTaza();
                    System.out.println("Ingrese un número con la acción que quiera realizar de acuerdo al menú"); 
                    System.out.println("1. Llenar la cafetera");
                    System.out.println("2. Servir en taza");
                    System.out.println("3. Vaciar cafetera");
                    System.out.println("4. Agregar café");
                    System.out.println("5. Salir");
        
                    opc = leer.nextInt();
                  break;
                case 3:
                    caf.vaciarCafetera();
                    System.out.println("Ingrese un número con la acción que quiera realizar de acuerdo al menú"); 
                    System.out.println("1. Llenar la cafetera");
                    System.out.println("2. Servir en taza");
                    System.out.println("3. Vaciar cafetera");
                    System.out.println("4. Agregar café");
                    System.out.println("5. Salir");
        
                    opc = leer.nextInt();
                  break;
                case 4:
                    caf.agregarCafe();
                    System.out.println("Ingrese un número con la acción que quiera realizar de acuerdo al menú"); 
                    System.out.println("1. Llenar la cafetera");
                    System.out.println("2. Servir en taza");
                    System.out.println("3. Vaciar cafetera");
                    System.out.println("4. Agregar café");
                    System.out.println("5. Salir");
        
                    opc = leer.nextInt();
                  break;
            }
        } while (opc != 5);
    }
    
}
