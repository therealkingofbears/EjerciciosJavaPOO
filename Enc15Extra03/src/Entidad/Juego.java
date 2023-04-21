/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Juego {
    public int numero1;
    public int numero2;
    
    public void iniciar_juego() {
        Scanner leer = new Scanner (System.in);
        System.out.println("JUGADOR 1: Ingrese el número a adivinar");
        numero1 = leer.nextInt();
        boolean val = true;
        
        System.out.println("JUGADOR 2: Tiene 10 intentos para adivinar el número");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número");
            numero2 = leer.nextInt();
            
            if (numero2 == numero1) {
                System.out.println("Usted ha adivinado el número");
                val = false;
                break;
            } else if (numero2 < numero1) {
                System.out.println("El número a adivinar es más alto");
            } else if (numero2 > numero1) {
                System.out.println("El número a adivinar es más bajo");
            }
            
        }
        
        if (true == val) {
            System.out.println("Usted ha agotado los intentos");
        }
    }
}
