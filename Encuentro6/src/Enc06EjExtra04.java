
import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */

/**
 *
 * @author diego
 */
public class Enc06EjExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String rom;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        do {
                System.out.println("El número ingresado no está dentro del parámetro permitido, vuelva a ingresarlo");
                num = leer.nextInt();
            } while (num < 1 || num > 10);
        
        switch (num) {
        case 1: 
            System.out.println("El número 1 es igual a I");
          break;
        case 2:
            System.out.println("El número 2 es igual a II");
          break;
        case 3: 
            System.out.println("El número 3 es igual a III");
          break;
        case 4:
            System.out.println("El número 4 es igual a IV");
          break;
        case 5:
            System.out.println("El número 5 es igual a V");
          break;
        case 6:
            System.out.println("El número 6 es igual a VI");
          break;
        case 7:
            System.out.println("El número 7 es igual a VII");
          break;
        case 8:
            System.out.println("El número 8 es igual a VIII");
          break;
        case 9:
            System.out.println("El número 9 es igual a IX");
          break;
        case 10:
            System.out.println("El número 10 es igual a X");
          break;
        }
    }
    
}
