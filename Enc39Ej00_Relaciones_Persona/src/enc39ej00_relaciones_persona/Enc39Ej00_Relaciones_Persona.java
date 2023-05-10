/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package enc39ej00_relaciones_persona;

import Entidades.DNI;
import Entidades.Persona;
import java.util.*;

/**
 *
 * @author diego
 */
public class Enc39Ej00_Relaciones_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea el objeto DNI
        DNI dni1 = new DNI();
        
        //Setea el objeto DNI
        dni1.setSerie("D");
        dni1.setNumero(25666798);
        
        //Incorpora los datos del DNI en un ArrayList
        ArrayList<DNI> dnis = new ArrayList<>();
        dnis.add(dni1);
        
        //Crea un objeto Persona
        Persona p = new Persona();
        p.setNombre("Franco");
        p.setApellido("Galarza");
        p.setDni(dnis);
        
        //Ingresa los datos de Persona en un ArrayList
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p);
        
        //Recorrer el objeto Persona y mostrarlo por terminal
        /*
        for (Persona persona : lista) {
            System.out.println(persona);
        }
        */
        for (Persona persona : lista) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
            List<DNI> dnisPersona = persona.getDni();
            for (DNI dni : dnisPersona) {
                System.out.println("DNI: " + dni.getSerie() + "-" + dni.getNumero());
            }
        }
    }
    
}
