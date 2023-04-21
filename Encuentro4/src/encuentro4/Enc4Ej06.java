/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc4Ej06 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int num1,num2,opc;
        String salir;
        Scanner leer = new Scanner (System.in);

        
        do {
            System.out.println("Ingrese dos números enteros positivos a usar en las próximas operaciones");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("Los números ingresados son " + num1 + " y " + num2);
        } while (num1 < 0 || num2 < 0);
        
        
        
        System.out.println("--------------------");
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("--------------------");
        
        System.out.println("Ingrese el número de opción");
        
        opc = leer.nextInt();
        
        do {
            switch (opc) {
            case 1:
                System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + (num1+num2));
                System.out.println("--------------------");
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("--------------------");
        
                System.out.println("Ingrese el número de opción");
        
                opc = leer.nextInt();
               break;
            case 2:
                System.out.println("La resta de " + num1 + " menos " + num2 + " es igual a " + (num1-num2));
                System.out.println("--------------------");
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("--------------------");
        
                System.out.println("Ingrese el número de opción");
        
                opc = leer.nextInt();
               break;
            case 3:
                System.out.println("El producto de " + num1 + " por " + num2 + " es igual a " + (num1*num2));
                System.out.println("--------------------");
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("--------------------");
        
                System.out.println("Ingrese el número de opción");
        
                opc = leer.nextInt();
               break;
            case 4:
                System.out.println("La división de " + num1 + " por " + num2 + " es igual a " + (num1/num2));
                System.out.println("--------------------");
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("--------------------");
        
                System.out.println("Ingrese el número de opción");
        
                opc = leer.nextInt();
               break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa?(S/N)?");
                salir = leer.next();
                
                if (!"S".equalsIgnoreCase(salir)){
                    System.out.println("--------------------");
                    System.out.println("MENU");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Salir");
                    System.out.println("--------------------");
        
                    System.out.println("Ingrese el número de opción");
                    opc = leer.nextInt();
                } else System.exit(0);
               break;
            }
        } while (opc > 0 && opc < 6);
    }
}

