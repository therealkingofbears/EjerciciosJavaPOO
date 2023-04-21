/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra o frase de 8 (ocho) caracteres");
        frase = leer.next();
        
        while (frase.length() != 8) {
            System.out.println("INCORRECTO");
            System.out.println("Ingrese una palabra o frase de 8 (ocho) caracteres");
            frase = leer.next();
        }
    }
    
}
