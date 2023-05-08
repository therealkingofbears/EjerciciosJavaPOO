/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
