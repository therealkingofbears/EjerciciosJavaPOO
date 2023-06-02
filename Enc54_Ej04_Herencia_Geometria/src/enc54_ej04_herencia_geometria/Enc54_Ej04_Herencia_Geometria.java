/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc54_ej04_herencia_geometria;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author diego
 */
public class Enc54_Ej04_Herencia_Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Rectangulo r1 = new Rectangulo(2,4);
        
        c1.calcularArea();
        c1.cacularPerimetro();
        
        r1.calcularArea();
        r1.cacularPerimetro();
    }
    
}
