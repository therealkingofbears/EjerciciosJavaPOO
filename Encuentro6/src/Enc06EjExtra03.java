
import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */

/**
 *
 * @author diego
 */
public class Enc06EjExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es vocal");
        }
    }
    
}
