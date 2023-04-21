/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro14_mascotapp;

import Entidad.Mascota;
import Servicios.ServicioMascota;

/**
 *
 * @author diego
 */
public class Encuentro14_MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();
            
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
        
        
        
//        public String nombre;
//        public String apodo;
//        public String tipo; //conejo, perro, gato, loro, carpincho
//        public int edad;
//        public boolean cola;
//        public String raza;
        
    }
    
}
