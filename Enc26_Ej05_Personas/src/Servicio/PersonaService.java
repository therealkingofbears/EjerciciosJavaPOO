/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PersonaService {
    Persona p1 = new Persona();
    Scanner leer = new Scanner (System.in);
    
    public void crearPersona(Persona p1) {
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        
        System.out.println("Ingrese el día de nacimiento");
        int day = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int year = leer.nextInt();
        
        Date feNac = new Date(year - 1900, mes - 1, day);
        p1.setFechaNac(feNac);
        
        System.out.println("Nombre ingresado: " + p1.getNombre());
        System.out.println("Fecha de Nacimiento: " + p1.getFechaNac());
                
    }
    
    public long calcularEdad(Persona p1) { 
        Date fechaActual = new Date();
        System.out.println("Fecha Actual: " + fechaActual);
        
        long difEnMilisegundos = fechaActual.getTime() - p1.getFechaNac().getTime();
        long difEnAnos = Math.round(difEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
        System.out.println("Edad: " + difEnAnos + " años.");
        return difEnAnos;
    }
    
    public void menorQue(Persona p1) {
        System.out.println("Ingrese una edad");
        int edad = leer.nextInt();
        boolean mayor = false;
        
        if (calcularEdad(p1) >= edad) {
            mayor = true;
            System.out.println("La persona es menor que la edad consultada: FALSE");
        } else if (calcularEdad(p1) < edad) {
            System.out.println("La persona es menor que la edad consultada: TRUE");
        }
    }
    
    public void mostrarPersona(Persona p1) {
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Fecha de Nacimiento: " + p1.getFechaNac());
    }
    
}
