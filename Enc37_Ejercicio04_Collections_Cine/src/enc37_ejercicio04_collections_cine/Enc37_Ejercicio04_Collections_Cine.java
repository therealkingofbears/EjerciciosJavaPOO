/*
Ejercicio 4 de Colecciones
 */
package enc37_ejercicio04_collections_cine;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;
/**
 *
 * @author diego
 */
public class Enc37_Ejercicio04_Collections_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        Pelicula peli = ps.crearPelicula();
        
        
        ps.largaPelicula(peli);
        ps.ordenarPeliculas();
    }
    
}
