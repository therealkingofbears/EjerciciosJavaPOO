/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Circulo implements calculosFormas {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    

    @Override
    public void calcularArea() {
        double area = Math.pow(p*radio, 2);
        System.out.println("El área del círculo es igual a " + area);
    }

    @Override
    public void cacularPerimetro() {
        double perimetro = p*2*radio;
        System.out.println("El perímetro del círculo es igual a " + perimetro);
    }
    
    
    
}
