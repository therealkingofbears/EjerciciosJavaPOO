/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc24_extra01_raices;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author diego
 */
public class Enc24_Extra01_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio ra = new RaicesServicio();
        Raices r1 = new Raices();
        
        r1 = ra.coeficientes();
        ra.getDiscriminante(r1);
        ra.tieneRaices(r1);
        ra.tieneRaiz(r1);
        ra.obtenerRaices(r1);
        ra.obtenerRaiz(r1);
        ra.calcular(r1);
        
        
    }
    
}
