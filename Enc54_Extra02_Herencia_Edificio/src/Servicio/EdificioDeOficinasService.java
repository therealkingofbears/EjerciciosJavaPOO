/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EdificioDeOficinasService extends EdificioService {
    private EdificioDeOficinas edificioDeOficinas = new EdificioDeOficinas();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearEdificioDeOficinas() {
        System.out.println("Ingrese el alto del edificio de oficinas");
        edificioDeOficinas.setAlto(leer.nextInt());

        System.out.println("Ingrese el ancho del edificio de oficinas");
        edificioDeOficinas.setAncho(leer.nextInt());

        System.out.println("Ingrese el largo del edificio de oficinas");
        edificioDeOficinas.setLargo(leer.nextInt());

        System.out.println("¿Cuántas oficinas hay en el edificio?");
        edificioDeOficinas.setNumOficinas(leer.nextInt());

        System.out.println("¿Cuántas personas entran en cada oficina?");
        edificioDeOficinas.setPersonasOficina(leer.nextInt());

        System.out.println("¿Cuántos pisos hay en el edificio?");
        edificioDeOficinas.setCantPisos(leer.nextInt());
    }

    public EdificioDeOficinas getEdificioDeOficinas() {
        return edificioDeOficinas;
    }

    public void cantPersonas() {
        System.out.println("La cantidad de personas que entran por piso en el edificio es igual a " + edificioDeOficinas.getNumOficinas() * edificioDeOficinas.getPersonasOficina());
        System.out.println("La cantidad de personas que entran en el edificio es igual a " + edificioDeOficinas.getCantPisos() * edificioDeOficinas.getNumOficinas() * edificioDeOficinas.getPersonasOficina());
    }

    @Override
    public void calcularSuperficie() {
        Integer superficie = edificioDeOficinas.getAncho() * edificioDeOficinas.getLargo();
    }

    @Override
    public void calcularVolumen() {
        Integer volumen = edificioDeOficinas.getAlto() * edificioDeOficinas.getAncho() * edificioDeOficinas.getLargo();
    }
}
