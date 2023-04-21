/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc20_ejvoid;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author diego
 */
public class Enc20_EjVoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio perServ = new PersonaServicio();
        
        Persona primer = perServ.crearPersona();
    }
    
}
