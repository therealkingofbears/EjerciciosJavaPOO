/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package enc43_ej01_relaciones_perros;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author diego
 */
public class Enc43_Ej01_Relaciones_Perros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.setNombre("Dita");
        perro1.setRaza("Shihtzu");
        perro1.setEdad(9);
        perro1.setTamanio("Chico");
        
        Perro perro2 = new Perro();
        perro2.setNombre("Sandino");
        perro2.setRaza("Mestizo");
        perro2.setEdad(10);
        perro2.setTamanio("Grande");
        
        Persona persona1 = new Persona();
        persona1.setNombre("Diego");
        persona1.setApellido("Feldman");
        persona1.setEdad(42);
        persona1.setDNI(28506038);
        persona1.setPerro(perro1);
       
        Persona persona2 = new Persona();
        persona2.setNombre("Yoel");
        persona2.setApellido("Feldman");
        persona2.setEdad(32);
        persona2.setDNI(35270668);
        persona2.setPerro(perro2);
        
        persona1.mostrarDatosPerro();
        persona2.mostrarDatosPerro();
    }
    
}
