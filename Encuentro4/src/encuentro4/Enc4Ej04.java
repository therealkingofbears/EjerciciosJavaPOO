/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase,fr;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase que comience con la letra A");
        frase = leer.next();
        
        fr = frase.substring(0, 1);
        System.out.println(fr);
        
        if (fr.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else
            System.out.println("INCORRECTO");
        
    }
    
}
