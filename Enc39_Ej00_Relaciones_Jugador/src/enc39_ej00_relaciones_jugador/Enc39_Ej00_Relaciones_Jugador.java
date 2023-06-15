/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package enc39_ej00_relaciones_jugador;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.*;

/**
 *
 * @author diego
 */
public class Enc39_Ej00_Relaciones_Jugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j = new Jugador();
        
        j.setNombre("Lucila");
        j.setApellido("Frend");
        j.setPosicion("Arquera");
        j.setNumero(1);
        
        ArrayList<Jugador> jug = new ArrayList<>();
        jug.add(j);
        
        Equipo eq = new Equipo();
        eq.setJugador(jug);
        
        for (Jugador jugador : jug) {
            System.out.println(jugador);
        }
    }
    
}
