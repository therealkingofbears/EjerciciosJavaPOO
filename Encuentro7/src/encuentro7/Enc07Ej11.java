/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.

a = @
e = #
i = $
o = %
u = *

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc07Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase a continuación");
        String frase = leer.nextLine();
        frase = frase.toLowerCase();
        
        String finl = letra(frase);
        
        System.out.println(""+finl);
        
    }
    
    public static String letra(String frase) {
        Scanner leer = new Scanner(System.in);
        String Aux = "" ;
        for (int i=0 ; i< frase.length(); i++) {
        switch (frase.substring(i,i+1).toLowerCase()){
        case "a" :
        Aux = Aux + "@" ;
        break;
        case "e" :
        Aux = Aux + "#" ;
        break;
        case "i" :
        Aux = Aux + "$" ;
        break;
        case "o" :
        Aux = Aux + "%" ;
        break;
        case "u" :
        Aux = Aux + "*" ;
        break;
        default :
        Aux = Aux + frase.substring(i,i+1);
        break;
        }
        }
        return Aux ;
    }
     
}
