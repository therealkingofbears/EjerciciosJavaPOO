
import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author diego
 */
public class Enc2Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
        
        Scanner lect = new Scanner (System.in);
        System.out.println("Ingrese un número");
        num1 = lect.nextInt();
        System.out.println("Usted ingresó el número " + num1);
        
        num2 = 2*num1;
        num3 = 3*num1;
        double num4 = Math.sqrt(num1);
        
        System.out.println("El doble de " + num1 + " es igual a " + num2);
        System.out.println("El triple de " + num1 + " es igual a " + num3);
        System.out.println("La raíz cuadrada de " + num1 + " es igual a " + num4);
    }
    
}
