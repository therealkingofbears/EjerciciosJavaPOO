/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc07Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        
        System.out.println("Ingrese un número para determinar si es primo o no");
        num = leer.nextInt();
        
        int es = primo(num);
        
        if (es <= 1) {
            System.out.println("El número ingresado, " + num + " , es primo");
        } else {
            System.out.println("El número ingresado, " + num + " , no es primo");
        }
    }
    
    public static int primo(int num) {
        int cont = 0;
        
        for (int i = 2; i < num+1; i++) {
            if (num % i == 0) {
                cont = cont + 1;
            }
        }
        return cont;
    }
    
}
