/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private Perro perro;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        if (perro == null) {
            perro = new Perro();
        }
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", perro=" + perro + '}';
    }
    
    public void mostrarDatosPerro() {
    if (perro != null) {
        System.out.println("Perro:");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Tamaño: " + perro.getTamanio());
    }
}
    
}
