
import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */

/**
 *
 * @author diego
 */
public class Enc06EjExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los minutos a convertir");
        int min = leer.nextInt();
        int dia,resto,hora;
        
        if (min >= 1400) {
            dia = min/1440;
            resto = min%1440;
            hora = resto/60;
        } else {
            dia = 0;
            resto = min%1440;
            hora = resto/60;
        }
        
        System.out.println("Usted ingresó " + min + " , lo que equivale a " + dia + " días y " + hora + " horas");
    }
    
}
