/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author diego
 */
public class Juego {
    private List<Jugador> jugadores;
    private Revolver r;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    //llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r) {
        Jugador ju = new Jugador();
        ju.getNombre();
        ju.isMojado();
        ju.getR();
        
        jugadores.add(ju);
        
        for (Jugador juga : jugadores) {
            System.out.println(ju.getNombre() + "-" + ju.isMojado() + "-" + ju.getR());
        }
    }
    
    /*
    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    */
    public void ronda() {
        
    }

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + ", leer=" + leer + '}';
    }
    
    
}
