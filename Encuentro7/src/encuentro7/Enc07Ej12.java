/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc07Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1,num2;
        
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        EsMultiplo(num1,num2);
    }
    
    public static void EsMultiplo(int num1, int num2) {
        boolean multiplo = false;
        
        if (num1 % num2 == 0) {
            multiplo = true;
            System.out.println("El primer número, " + num1 + " es múltiplo del segundo, " + num2);
        } else {
            multiplo = false;
            System.out.println("El primer número, " + num1 + " NO es múltiplo del segundo, " + num2);
        }
    }
    
}
