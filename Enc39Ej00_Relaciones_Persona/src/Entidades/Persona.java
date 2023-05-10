/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private List<DNI> dni;

    public List<DNI> getDni() {
        return dni;
    }

    public void setDni(List<DNI> dni) {
        this.dni = dni;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, List<DNI> dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
}
