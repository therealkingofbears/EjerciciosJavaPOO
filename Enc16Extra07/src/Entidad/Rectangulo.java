/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Rectangulo {
    private int lado1;
    private int lado2;
    
    public void calcular_area() {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la base y la altura del rectángulo");
        lado1 = leer.nextInt();
        lado2 = leer.nextInt();
        
        int area = lado1*lado2;
        System.out.println("El área del rectángulo es igual a " + area);
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public Rectangulo() {
    }
    
    
}
