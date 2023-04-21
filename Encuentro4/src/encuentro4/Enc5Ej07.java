/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc5Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int i,j;
        i = 0;
        j = 0;
                
        Scanner leer = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese una cadena de 5 caracteres que inicie con X y finalice en O");
            cadena = leer.next();
        } while (cadena.length() != 5);
        
        String cad1 = cadena.substring(0, 1);
        String cad2 = cadena.substring(4, 5);
        
        System.out.println(cad1 + " ; " + cad2);
        
        while (!cadena.equals("&&&&&")) {
                      
            
            if (cad1.equalsIgnoreCase("X") && cad2.equalsIgnoreCase("O")) {
                System.out.println("LECTURA CORRECTA");
                i = i + 1;
            } else {
                System.out.println("LECTURA INCORRECTA");
                j = j + 1;
            }
            
            System.out.println("Ingrese una cadena de 5 caracteres que inicie con X y finalice en O");
            cadena = leer.next();
            
            cad1 = cadena.substring(0, 1);
            cad2 = cadena.substring(4, 5);
        }
        
        System.out.println("Cantidad de respuestas correctas: " + i);
        System.out.println("Cantidad de respuestas incorrectas: " + j);

        
    }
    
}
