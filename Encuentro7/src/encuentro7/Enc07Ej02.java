/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc07Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n = 50;
        String opc = "S";
        
        do {
            datos(n);
            System.out.println("Desea ingresar otra persona?");
            opc = leer.next();
        } while (!(opc.equalsIgnoreCase("n")));
        
    }
    
    public static void datos(int n) {
        Scanner leer = new Scanner (System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingrese el nombre");
        nombre = leer.nextLine();

        System.out.println("Ingrese la edad");
        edad = leer.nextInt();

        if (edad < 18) {
            System.out.println("Nombre ingresado: " + nombre);
            System.out.println("Edad ingresada: " + edad);
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Nombre ingresado: " + nombre);
            System.out.println("Edad ingresada: " + edad);
            System.out.println("Es mayor de edad");
        }
    }
}
