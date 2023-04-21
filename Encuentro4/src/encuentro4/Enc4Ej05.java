/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lim,num,ac;
        
        Scanner leer = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese el valor límite positivo");
            lim = leer.nextInt();
        } while (lim < 1);
        
        
        ac = 0;
        
        do {
            System.out.println("Ingrese un número hasta que la suma de los ingresados sea mayor al límite inicial");
            num = leer.nextInt();
            ac = ac + num;
        } while (ac <= lim);
        
        System.out.println("Usted ingresó el límite " + lim + " y la suma de los números ingresados luego es igual a " + ac);
    }
    
}
