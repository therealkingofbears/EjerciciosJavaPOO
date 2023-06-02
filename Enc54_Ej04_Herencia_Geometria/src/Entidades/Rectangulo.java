/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Rectangulo implements calculosFormas {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base*altura;
        System.out.println("El área del rectángulo es igual a " + area);
    }

    @Override
    public void cacularPerimetro() {
        double perimetro = (base + altura)*2;
        System.out.println("El perímetro del rectángulo es igual a " + perimetro);
    }
    
    
    
}
