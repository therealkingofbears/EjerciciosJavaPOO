/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        System.out.println("Ingrese una nota entre 0 y 10");
        Scanner leer = new Scanner (System.in);
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
           System.out.println("La nota ingresada no es correcta; vuelva a intentar con una nota comprendida entre 0 y 10"); 
           nota = leer.nextInt();
        }
        
        System.out.println("La nota ingresada es " + nota);
    }
    
}
