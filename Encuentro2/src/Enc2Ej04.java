
import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */

/**
 *
 * @author diego
 */
public class Enc2Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grados,fahr;
        Scanner lect = new Scanner (System.in);
        System.out.println("Ingrese una temperatura en grados centígrados para convertir a Fahrenheits");
        
        grados = lect.nextDouble();
        
        fahr = 32+(9*grados/5);
        
        System.out.println("Usted ingresó " + grados + " Centígrados, y eso equivale a " + fahr + " Fahrenheits");
        
    }
    
}
