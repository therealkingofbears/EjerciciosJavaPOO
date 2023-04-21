/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    
    public void ingresar_empleado() {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del empleado");
        nombre = leer.next();
        
        System.out.println("Ingrese la edad del empleado");
        edad = leer.nextInt();
        
        System.out.println("Ingrese el salario actual del empleado");
        salario = leer.nextDouble();
    }
    
    public void calcular_aumento() {
        double aumento,total;
        
        if (edad >= 30) {
            aumento = 0.10;
            total = salario*aumento;
            System.out.println("El aumento es del 10% y es igual a $" + total);
        } else {
            aumento = 0.05;
            total = salario*aumento;
            System.out.println("El aumento es del 5% y es igual a $" + total);
        }
    }
}
