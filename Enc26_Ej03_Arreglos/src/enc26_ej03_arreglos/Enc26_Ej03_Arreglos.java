/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales..
 */
package enc26_ej03_arreglos;

import Servicio.ArregloService;

/**
 *
 * @author diego
 */
public class Enc26_Ej03_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        ArregloService as1 = new ArregloService();
        
        A = as1.inicializarA(A);
        as1.mostrarA(A);
        A = as1.ordenarA(A);
        B = as1.incializarB(A, B);
        as1.mostrarAmbas(A, B);
        
    }
    
}
