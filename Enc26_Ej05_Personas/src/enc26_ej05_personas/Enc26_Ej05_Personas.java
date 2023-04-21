/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc26_ej05_personas;

import Entidades.Persona;
import Servicio.PersonaService;

/**
 *
 * @author diego
 */
public class Enc26_Ej05_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps1 = new PersonaService();
        Persona pe1 = new Persona();
        
        ps1.crearPersona(pe1);
        
        System.out.println("-----");
        ps1.calcularEdad(pe1);
        
        System.out.println("-----");
        ps1.menorQue(pe1);
        
        System.out.println("-----");
        System.out.println("Datos de la persona");
        ps1.mostrarPersona(pe1);
    }
    
}
