/*
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.

b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje

c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PersonaServicio {
    Persona pers = new Persona();
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        pers.setNombre(leer.next());
        
        System.out.println("Ingrese la edad");
        pers.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura");
        pers.setAltura(leer.nextDouble());
        
        System.out.println("Ingrese el peso");
        pers.setPeso(leer.nextDouble());
                
        System.out.println("Ingrese el sexo (H, M, o O)");
         pers.setSexo(leer.next());
        
         while (!"H".equalsIgnoreCase(pers.getSexo()) && !"M".equalsIgnoreCase(pers.getSexo()) && !"O".equalsIgnoreCase(pers.getSexo())) {
            System.out.println("Usted ingresó una opción incorrecta");
            System.out.println("Ingrese el sexo (H, M, o O)");
            pers.setSexo(leer.next());
         } 
       
        return pers;
    }
    
    public boolean esMayorDeEdad() {
        boolean may = false;
        if (pers.getEdad() >= 18) {
            may = true;
            System.out.println(pers.getNombre() + " es mayor de edad");
        } else {
            System.out.println(pers.getNombre() + " es menor de edad");
        }
        return may;
    }
    
    public int calcularIMC() {
        double IMC;
        int res = 0;
        IMC = pers.getPeso() / Math.pow(pers.getAltura(),2);
        
        if (IMC < 20) {
            res = -1;
            System.out.println(pers.getNombre() + " está por debajo de su peso ideal");
        } else if (IMC >= 20 && IMC <= 25){
            res = 0;
            System.out.println(pers.getNombre() + " se encuentra en su peso ideal");
        } else if (IMC > 25) {
            res = 1;
            System.out.println(pers.getNombre() + " tiene sobrepeso");
        }
        
        return res;
    }
    
}
