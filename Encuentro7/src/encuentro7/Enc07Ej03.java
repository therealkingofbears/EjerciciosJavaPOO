/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc07Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double euros;
        
        System.out.println("Ingrese la cantidad de euros que quiere convertir");
        euros = leer.nextInt();
        
        System.out.println("Ingrese la moneda a la que quiere convertir los Euros, pudiendo ser libra, dolar o yen");
        String divisa = leer.next();
        
        conversor(euros,divisa);
        
    }
    
    public static void conversor(double euros, String divisa) {
        double res;
        
        switch (divisa) {
            case "libra":
              res = euros*0.86;
              System.out.println("El cambio es igual a £" + res);
             break;
            case "dolar":
              res = euros*1.28611;
              System.out.println("El cambio es igual a $" + res);
             break;
            case "yen":
              res = euros*129.852;
              System.out.println("El cambio es igual a ¥" + res);
             break;
        }
    }
}
