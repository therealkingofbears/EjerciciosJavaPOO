/*

 */
package Servicios;

import java.util.*;
import Entidades.Pelicula;

/**
 *
 * @author diego
 */
public class PeliculaServicio {
    private ArrayList<Pelicula> pel = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    // Definimos el Comparator
    Comparator<Pelicula> cmprtr = Comparator.comparing(Pelicula::getDuracion);
    

    Comparator<Pelicula> cmprtr1 = Comparator.comparing(Pelicula::getDuracion);
    

    public Pelicula crearPelicula() {
        String opc = "S";

        while (!"N".equals(opc)) {
            Pelicula peli = new Pelicula();
            System.out.println("Ingrese el título de la película");
            String tit = leer.next();

            System.out.println("Ingrese el director de la película");
            String dir = leer.next();

            System.out.println("Ingrese la duración de la película expresada en horas");
            float dur = leer.nextFloat();

            peli.setTitulo(tit);
            peli.setDirector(dir);
            peli.setDuracion(dur);

            pel.add(peli);

            System.out.println("Quiere ingresar otra película? Responda <S> para sí, o <N> para no");
            opc = leer.next().toUpperCase();

            while (!"S".equalsIgnoreCase(opc) && !"N".equalsIgnoreCase(opc)) {
                System.out.println("Opción inválida. Ingrese S o N.");
                opc = leer.next().toUpperCase();
            }
        }

        System.out.println("--------");
        System.out.println("Lista de películas");

        for (Pelicula lista : pel) {
            System.out.println(lista);
        }

        return new Pelicula();
    }

    public void largaPelicula(Pelicula peli) {
        Iterator it = pel.iterator();
        ArrayList<Pelicula> larga = new ArrayList<>();

        while (it.hasNext()) {
            Pelicula p = (Pelicula) it.next();
            if (p.getDuracion() >= 1) {
                larga.add(p);
            }
        }

        System.out.println("--------");
        System.out.println("Películas con duración mayor a 1 hora");

        for (Pelicula lista : larga) {
            System.out.println(lista);
        }
    }

    public void ordenarPeliculas() {
        // Ordenamos la lista utilizando el Comparator
        System.out.println("Películas ordenadas de mayor a menor año");
        Collections.sort(pel, cmprtr.reversed());
        System.out.println("-----");
        System.out.println("Peliculas ordenadas de menor a mayor año");
        Collections.sort(pel, cmprtr1);
    }
}
