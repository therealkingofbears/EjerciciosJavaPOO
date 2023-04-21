
import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */

/**
 *
 * @author diego
 */
public class Enc3Ej00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer1.nextInt();
        int num2 = leer1.nextInt();
        
        int suma;
        suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " sumado a " + num2 + " es igual a " + suma);
    }
    
}
