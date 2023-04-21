
import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

/**
 *
 * @author diego
 */
public class Enc2Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = lectura.nextLine();
        
        String may = frase.toUpperCase();
        String min = frase.toLowerCase();
        System.out.println(may);
        System.out.println(min);
                
    }
    
}
