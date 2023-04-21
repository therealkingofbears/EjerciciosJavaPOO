/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CafeteraServicio {
    Scanner leer = new Scanner (System.in);
    Cafetera c1 = new Cafetera();
    
    public Cafetera capacidadMaxima() {
        int max = 1500;
        c1.setCapacidadMaxima(max);
        return c1;
    }
    
    public Cafetera llenarCafetera() {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La capacidad de la cafetera ahora es " + c1.getCantidadActual() + " ml");
        return c1;
    }
    
    public Cafetera servirTaza() {
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        
        if (taza <= c1.getCantidadActual()) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Se llenó la taza");
        } else {
            taza = c1.getCantidadActual();
            System.out.println("No se pudo llenar la taza; solamente se llenaron " + taza + " ml");
            c1.setCantidadActual(0);
        }
        
        return c1;
    }
    
    public Cafetera vaciarCafetera() { 
        c1.setCantidadActual(0);
        
        return c1;
    }
    
    public Cafetera agregarCafe() {
        System.out.println("¿Qué cantidad de café quiere ingresar?");
        int cant = leer.nextInt();
        
        while (cant > c1.getCapacidadMaxima()) {
            System.out.println("La cantidad que quiere ingresar excede el máximo de café permitido. Ingrese la cantidad nuevamente");
            cant = leer.nextInt();
        } 
        
        c1.setCantidadActual(cant);
        
        return c1;
    }
    
}
