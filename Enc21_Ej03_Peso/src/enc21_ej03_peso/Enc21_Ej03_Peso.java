/*
en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package enc21_ej03_peso;

import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc21_Ej03_Peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int c = 0;
        Scanner leer = new Scanner(System.in);
        PersonaServicio p1 = new PersonaServicio();
        PersonaServicio p2 = new PersonaServicio();
        PersonaServicio p3 = new PersonaServicio();
        PersonaServicio p4 = new PersonaServicio();
        
        p1.crearPersona();
        p1.esMayorDeEdad();
        p1.calcularIMC();
        
        p2.crearPersona();
        p2.esMayorDeEdad();
        p2.calcularIMC();
        
        p3.crearPersona();
        p3.esMayorDeEdad();
        p3.calcularIMC();
        
        p4.crearPersona();
        p4.esMayorDeEdad();
        p4.calcularIMC();
        
        boolean[] mayor = new boolean[4];
        int[] indice = new int[4];
        
        mayor[0] = p1.esMayorDeEdad();
        mayor[1] = p2.esMayorDeEdad();
        mayor[2] = p3.esMayorDeEdad();
        mayor[3] = p4.esMayorDeEdad();
        
        indice[0] = p1.calcularIMC();
        indice[1] = p2.calcularIMC();
        indice[2] = p3.calcularIMC();
        indice[3] = p4.calcularIMC();
        
        if (p1.calcularIMC() == -1) {
            cont = cont + 1;
        }
        
        if (p2.calcularIMC() == -1) {
            cont = cont + 1;
        }
        
        if (p3.calcularIMC() == -1) {
            cont = cont + 1;
        }
        
        if (p4.calcularIMC() == -1) {
            cont = cont + 1;
        }
        
        int porc = (cont/4)*100;
        
        System.out.println("El porcentaje de personas por debajo de su peso es " + porc + "%");
        
        if (p1.esMayorDeEdad() == true) {
            c = c + 1;
        }
        
        if (p2.esMayorDeEdad() == true) {
            c = c + 1;
        }
        
        if (p3.esMayorDeEdad() == true) {
            c = c + 1;
        }
        
        if (p4.esMayorDeEdad() == true) {
            c = c + 1;
        }
        
        int per = (c/4)*100;
        
        System.out.println("El porcentaje de mayores de edad es " + per + "%");
    }

    private static String toString(boolean esMayorDeEdad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
