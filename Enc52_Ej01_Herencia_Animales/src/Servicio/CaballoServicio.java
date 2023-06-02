/*
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
 */
package Servicio;

import Entidades.Caballo;

/**
 *
 * @author diego
 */
public class CaballoServicio extends Caballo {
    
    public CaballoServicio(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println("Come Pasto");
    }
}
