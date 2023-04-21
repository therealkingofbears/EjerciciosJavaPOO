/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos números");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 >= 25) {
        System.out.println("El número 1 es mayor a 25");
        } else if(num2 >= 25) {
            System.out.println("El número 2 es mayor a 25");
        } else {
            System.out.println("Ningún número es mayor a 25");
        
    }
    }
    
}
