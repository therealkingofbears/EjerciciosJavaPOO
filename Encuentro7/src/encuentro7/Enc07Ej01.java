/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc07Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1,num2;
        
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("Ingrese la opción con un número de 1 a 4 de acuerdo al tipo de operación que quiera realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int opcion = leer.nextInt();
        
        do {
            switch (opcion) {
                case 1:
                    int res1 = sumar(num1,num2);
                  break;
                case 2:
                    int res2 = restar(num1,num2);
                  break;
                case 3:
                    int res3 = multiplicar(num1,num2);
                  break;
                case 4:
                    int res4 = dividir(num1,num2);
                  break;
            }
            
            System.out.println("Ingrese la opción con un número de 1 a 4 de acuerdo al tipo de operación que quiera realizar");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
        } while (opcion != 5);
        
        
        
        
    }
    
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("El restultado de la suma de " + num1 + " y " + num2 + " es igual a " + suma);
        return suma;
    }
    
    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        System.out.println("El restultado de la resta de " + num1 + " menos " + num2 + " es igual a " + resta);
        return resta;
    }
    
    public static int multiplicar(int num1, int num2) {
        int multip = num1*num2;
        System.out.println("El producto de la multiplicación de " + num1 + " por " + num2 + " es igual a " + multip);
        return multip;
    }
    
    public static int dividir(int num1, int num2) {
        int div = num1/num2;
        System.out.println("El producto de la división de " + num1 + " y " + num2 + " es igual a " + div);
        return div;
    }
}
