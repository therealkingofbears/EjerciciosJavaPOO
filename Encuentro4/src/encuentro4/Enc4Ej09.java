/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,i,cont;
       
       i = 0;
       cont = 0;
       
       Scanner leer = new Scanner (System.in);
                 
       do {
          System.out.println("Ingrese un número");
          num = leer.nextInt();
          i = num + i;
          cont = cont + 1;
          if (num == 0) {
             System.out.println("Se capturó el numero cero");
             break;
          }
          } while (cont < 21);
       
        
        System.out.println("La suma de los números ingresados es igual a " + i);
    }
    
}
