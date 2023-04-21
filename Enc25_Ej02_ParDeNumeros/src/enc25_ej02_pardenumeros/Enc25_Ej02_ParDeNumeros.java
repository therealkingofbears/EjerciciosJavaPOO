/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc25_ej02_pardenumeros;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author diego
 */
public class Enc25_Ej02_ParDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ParDeNumeros pr1 = new ParDeNumeros();
       ParDeNumerosService pn1 = new ParDeNumerosService();
       
       pn1.mostrarValores(pr1);
       pn1.devolverMayor(pr1);
       pn1.calcularPotencia(pr1);
       pn1.calculaRaiz(pr1);
       
    }
    
}
