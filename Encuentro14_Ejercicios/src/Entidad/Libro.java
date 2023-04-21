/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Libro {
    public int ISBN;
    public String Título;
    public String Autor;
    public int NumPag;

    public Libro() {
    }

    public Libro(int ISBN, String Título, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }
    
    public void datos() {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el título del libro");
        Título = leer.nextLine();
        
        System.out.println("Ingrese el autor");
        Autor = leer.nextLine();
        
        System.out.println("Ingrese el número de páginas");
        NumPag = leer.nextInt();
        
        System.out.println("Ingrese el ISBN");
        ISBN = leer.nextInt();
    }
    
    public void mostrar() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + Título);
        System.out.println("Autor: " + Autor);
        System.out.println("Número de páginas: " + NumPag);
    }
}

