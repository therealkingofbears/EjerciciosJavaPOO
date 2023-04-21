/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Rectangulo {
    private int base;
    private int altura;
    
    
    public void crearRectangulo() {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la base y la altura del rectángulo para crearlo");
        base = leer.nextInt();
        altura = leer.nextInt();
    }
    
    public double superficie() {
        return base*altura;
    }
    
    public double perimetro() {
        return (base + altura)*2;
    }
    
    public void mostrar() {
        System.out.println("La superficie es igual a " + superficie());
        System.out.println("El perímetro es igual a " + perimetro());
    }
    
    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    
}
