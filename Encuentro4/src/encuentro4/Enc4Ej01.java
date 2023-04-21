/*
Crear un programa que dado un número determine si es par o impar.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un número para determinar si es par o impar");
        Scanner leer = new Scanner (System.in);
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número elegido, " + num + " es par");
        } else {
            System.out.println("El número elegido, " + num + " es impar");
        }
    }
    
}
