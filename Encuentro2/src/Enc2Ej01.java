
import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */

/**
 *8
 * @author diego
 */
public class Enc2Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2,suma;
     
        Scanner leer = new Scanner (System.in);  
        System.out.println ("Ingresa dos números:");
         
        numero1 = leer.nextInt ();
        numero2 = leer.nextInt();
         
        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es " + suma);
        
                
               

                
        

    }
    
}
