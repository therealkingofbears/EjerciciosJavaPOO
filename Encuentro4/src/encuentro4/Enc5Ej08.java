/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
* *
* *
* * * *
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc5Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado");
        int num = leer.nextInt();
        
        for (int i = 0; i <=num-1; i++) {
            for (int j = 0; j <=num-1; j++) {
                if (j == 0 || j == num-1 || i == 0 || i == num-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    
