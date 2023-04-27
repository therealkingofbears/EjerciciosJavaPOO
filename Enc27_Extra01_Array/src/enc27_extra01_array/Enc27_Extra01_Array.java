/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc27_extra01_array;

import Entidades.Array;
import Servicio.ArrayServicio;

/**
 *
 * @author diego
 */
public class Enc27_Extra01_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayServicio as1 = new ArrayServicio();
        Array sv = as1.llenarArray();
        
        
        as1.adivinarMesSecreto(sv);
        
    }
    
}
