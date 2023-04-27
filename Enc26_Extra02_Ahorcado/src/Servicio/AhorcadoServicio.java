/*
Definir los siguientes métodos en
AhorcadoService:
.

Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
package Servicio;

import Entidades.Ahorcado;
import java.util.*;

/**
 *
 * @author diego
 */
public class AhorcadoServicio {
    Ahorcado ah = new Ahorcado();
    Scanner leer = new Scanner (System.in);
    
    /*
    ● Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
*/
    
    public Ahorcado crearJuego(Ahorcado ah) {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next().toUpperCase();
        ah.setPalabra(palabra);
        ah.setJugMax(ah.getPalabra().length());
        
        
        String[] vec = new String[ah.getPalabra().length()];
        
        for (int i = 0; i < ah.getPalabra().length(); i++) {
            vec[i] = Character.toString(ah.getPalabra().charAt(i));
        }
        
        ah.setVector(vec);
        return ah;
}
    
    //● Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    
    public void longitud(Ahorcado ah) {
        int longitud;
        longitud = ah.getPalabra().length();
        System.out.println("La longitud de la palabra a encontrar es " + longitud);
    }
    
    /*
    ● Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
    */
    
    public void buscar(Ahorcado ah) {
        System.out.println("Ingrese una letra para ver si es o no parte de la palabra");
        String letra = leer.next();
        String[] vec = Arrays.copyOf(ah.getVector(), ah.getVector().length);
        int cont = 0;
        
        for (int i = 0; i < vec.length; i++) {
            if (vec[i].equalsIgnoreCase(letra)) {
                cont = cont + 1;
            }
        }
        
        if (cont > 0) {
            System.out.println("La letra aparece " + cont + " veces");
        } else {
            System.out.println("La letra no aparece en la palabra");
        }
    }
    
    /*
    ● Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades. 
    */
    
    public boolean encontradas(Ahorcado ah) {
        String[] vec = Arrays.copyOf(ah.getVector(), ah.getVector().length);
        boolean esta = false;
        int cont = 0;
        int c = 0;
        int a = 0;

        System.out.println("Ingrese una letra para ver si es o no parte de la palabra");
        String letra = leer.next();

        for (int i = 0; i < vec.length; i++) {
            if (vec[i].equalsIgnoreCase(letra)) {
                cont++;
                esta = true;
            } else {
                c++;
            }
        }

        System.out.println("Letras encontradas: " + cont);
        System.out.println("Intentos faltantes: " + c);

        return esta;
    }
    
    //● Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public int intentos(Ahorcado ah) { 
        int a= 0;
        boolean b = encontradas(ah);
        int intentos = ah.getJugMax();
        
        if (b = false) {
            a = a + 1;
            intentos = ah.getJugMax() - a;
            System.out.println("Quedan " + a + " intentos");
        }
        
        return intentos;
    }
    
    public int adivinadas(Ahorcado ah) {
        int a= 0;
        boolean b = encontradas(ah);
        int intentos = ah.getJugMax();
        
        if (b = true) {
            a = a + 1;
            intentos = ah.getJugMax() - a;
            System.out.println("Quedan " + a + " intentos");
        }
        
        return intentos;
    }
    
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se llamará en el main
    */
    
    public void juego(Ahorcado ah) {
        crearJuego(ah);
        longitud(ah);
        
        do {
            buscar(ah);
            encontradas(ah);
            intentos(ah);
            adivinadas(ah);
        } while (intentos(ah) != 0 || adivinadas(ah) == ah.getJugMax());
        
        
        if (intentos(ah) == 0) {
            System.out.println("Ya no le quedan intentos, el juego ha finalizado");
        } else if (adivinadas(ah) == ah.getJugMax()) {
            System.out.println("Felicitaciones! Ha adivinado la palabra");
        }
        
    }

}
