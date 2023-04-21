/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc25_ej01_cadena;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author diego
 */
public class Enc25_Ej01_Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio ca1 = new CadenaServicio();
        Cadena cu1 = new Cadena();
        
        ca1.pedirFrase(cu1);
        ca1.mostrarVocales(cu1);
        ca1.invertirFrase(cu1);
        ca1.vecesRepetido(cu1);
        ca1.compararLongitud(cu1);
        ca1.unirFrases(cu1);
        ca1.reemplazar(cu1);
        ca1.contiene(cu1);
        
        
    }
    
}
