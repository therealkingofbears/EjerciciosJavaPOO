/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase,eureka;
        
        eureka = "eureka";
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        if (eureka.equals(frase)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
