/*
De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author diego
 */
public class Cine {
    private Pelicula pelicula;
    private List<Espectador> espectador;
    private double precio;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(List<Espectador> espectador) {
        this.espectador = espectador;
    }
    
    
}
