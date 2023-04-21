package Servicios;


import Entidades.Cadena;
import java.util.Scanner;

/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */

/**
 *
 * @author diego
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    Cadena c1 = new Cadena();
    
    public void pedirFrase(Cadena c1) {
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.nextLine());
    }
    
    public void mostrarVocales(Cadena c1) {
        int cont = 0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if (c1.getFrase().charAt(i) == 'a' || c1.getFrase().charAt(i) == 'e' || c1.getFrase().charAt(i) == 'i' || c1.getFrase().charAt(i) == 'o' || c1.getFrase().charAt(i) == 'u') {
                cont++;
            }
        }
        
        System.out.println("La cantidad de vocales es " + cont);
    }
    
    public void invertirFrase(Cadena c1) {
        String invert = "";
        
        for (int i = c1.getFrase().length() - 1; i >= 0; i--) {
            invert += c1.getFrase().charAt(i);
        }
        
        System.out.println("La frase original es: <" + c1.getFrase() + ">");
        System.out.println("La frase invertida es: <" + invert + ">");
    }
    
    public void vecesRepetido(Cadena c1) {
        System.out.println("Ingrese una letra para ver cuántas veces se repite en la frase");
        String letra = leer.next();
        int count = 0;
        
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if (c1.getFrase().charAt(i) == letra.charAt(0)) {
                count++;
            }
        }
        
        System.out.println("La frase se repite " + count + " veces");
    }
    
    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese otra frase para compararla con la original");
        String fras = leer.next();
        
        if (c1.getFrase().length() == fras.length()) {
            System.out.println("La longitud de ambas frases es la misma");            
        } else {
            System.out.println("La longitud de las frases es distinta");
        }
    }
    
    public void unirFrases(Cadena c1) {
        System.out.println("Ingrese una frase para unir a la original");
        leer.nextLine(); // Consumir el salto de línea pendiente
        String fr = leer.nextLine();

        String resul = c1.getFrase().concat(fr);

        System.out.println(resul);
}
    
    public void reemplazar(Cadena c1) { 
        System.out.println("Ingrese una letra que reemplace todas las <a> de la frase ingresada originalmente");
        String letra = leer.next();
        String dato = c1.getFrase();
        
        for (int i = 0; i < c1.getFrase().length(); i++) { 
            if (c1.getFrase().charAt(i) == 'a') {
                dato = c1.getFrase().replaceAll("a", letra);
            }
        }
        System.out.println("La frase resultante es: " + dato);
                
    }
    
    public void contiene(Cadena c1) {
        System.out.println("Ingrese una letra para ver si la frase la contiene");
        String letra = leer.next();
        boolean si = false;
        
        si = c1.getFrase().toLowerCase().contains(letra);
        System.out.println(si);

    }
}
