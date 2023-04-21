/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ParDeNumerosService {
    ParDeNumeros par = new ParDeNumeros();
    Scanner leer = new Scanner (System.in);
    
    
    public void mostrarValores(ParDeNumeros par) {
        System.out.println("El primer número es = " + par.getN1());
        System.out.println("El segundo número es = " + par.getN2());
    }
    
    public void devolverMayor(ParDeNumeros par) { 
        double max = Math.max(par.getN1(), par.getN2());
        System.out.println("Máximo: " +  max);
    }
    
    public void calcularPotencia(ParDeNumeros par) {
        double max = Math.round(Math.max(par.getN1(), par.getN2()));
        double min = Math.round(Math.min(par.getN1(), par.getN2()));
        
        double pot = Math.pow(max,min);
        System.out.println("Potencia = " + pot);
    }
    
    public void calculaRaiz(ParDeNumeros par) {
        double max = Math.round(Math.max(par.getN1(), par.getN2()));
        double min = Math.round(Math.min(par.getN1(), par.getN2()));
        double abs = Math.abs(max);
        
        double raiz = Math.pow(abs,1/min);
        System.out.println("Raíz = " + raiz);
    }
    
}
