/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FechaService {
    Scanner leer = new Scanner (System.in);
    private Date fechaNacimiento;
    private Date fechaActual;
       
    public void fechaNacimiento(FechaService fs) {
        System.out.println("Ingrese el día de su nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int ano = leer.nextInt();
        
        
        fechaNacimiento = new Date(ano - 1900, mes - 1, dia);
        fechaNacimiento.getDate();
        fechaNacimiento.getMonth();
        fechaNacimiento.getYear();
        
        System.out.println(fechaNacimiento);
    }
    
    
    
    public void fechaActual(FechaService fs) {
        fechaActual = new Date();
        System.out.println(fechaActual);
    }
    
    public void diferencia(Date fecha, Date fechaActual) {
    long difEnMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
    long difEnAnos = Math.round(difEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
    System.out.println("La diferencia entre las dos fechas es de " + difEnAnos + " años.");
}

    public Date getFechaNacimiento() {
        return fechaNacimiento;
}

    public Date getFechaActual() {
        return fechaActual;
    }

    public Date FechaNacimiento() {
        return fechaNacimiento;
    }

    public Date FechaActual() {
        return fechaActual;
    }
}
