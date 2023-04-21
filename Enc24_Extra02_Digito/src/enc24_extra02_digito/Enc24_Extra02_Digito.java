/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc24_extra02_digito;

import Servicios.NIFService;

/**
 *
 * @author diego
 */
public class Enc24_Extra02_Digito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService ni = new NIFService();
        
        ni.crearNif();
        ni.mostrar();
    }
    
}
