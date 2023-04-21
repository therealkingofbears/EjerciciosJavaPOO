/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package Servicio;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ArregloService {
    Scanner leer = new Scanner (System.in);

    public double[] inicializarA(double[] A) {
        for(int i = 0; i < A.length; i++) {
            A[i] = Math.random()*90+1;
        }
        return A;
    }
    
    public void mostrarA(double A[]) {
        for (int i =0; i < A.length; i++) {
            System.out.print(" [ " + A[i] + " ] ");
        }
    }
    
    public double[] ordenarA(double A[]) {
        Arrays.sort(A);
        return A;
    }
    
    public double[] incializarB(double[] A, double[] B) {
        System.arraycopy(A, 0, B, 0, 10);
        
        for (int j = 10; j < 20; j++) {
            B[j] = 0.5;
        }
        
        return B;
    }
    
    public void mostrarAmbas(double[] A, double[] B) {
        System.out.println("---------");
        System.out.println("");
        System.out.println("Vector A");
        for (int i =0; i < A.length; i++) {
            System.out.print(" [ " + A[i] + " ] ");
        }
        
        System.out.println("");
        System.out.println("---------");
        System.out.println("");
        
        System.out.println("Vector B");
        for (int i =0; i < B.length; i++) {
            System.out.print(" [ " + B[i] + " ] ");
        }
    }
    
}
