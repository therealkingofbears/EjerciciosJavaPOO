
import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */

/**
 *
 * @author diego
 */
public class Enc2Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = lectura.nextLine();
        
        System.out.println("Su nombre es " + nombre);
    }
    
}
