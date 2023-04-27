/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc26_extra02_ahorcado;

import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;

/**
 *
 * @author diego
 */
public class Enc26_Extra02_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ahorcado a1 = new Ahorcado();
       AhorcadoServicio as1 = new AhorcadoServicio();
       
       as1.juego(a1);
    }
    
}
