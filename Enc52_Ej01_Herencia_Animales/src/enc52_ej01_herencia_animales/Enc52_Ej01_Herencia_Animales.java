/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc52_ej01_herencia_animales;

import Entidades.Animal;
import Servicio.CaballoServicio;
import Servicio.GatoServicio;
import Servicio.PerroServicio;

/**
 *
 * @author diego
 */
public class Enc52_Ej01_Herencia_Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal gatoServicio = new GatoServicio("Pedru", "CatChow", 10, "Mestizo");
        Animal perroServicio = new PerroServicio("Dita", "ProPlan", 8, "Shihtzu");
        Animal caballoServicio = new CaballoServicio("Bebu", "Pasto", 5, "Arabe");

        gatoServicio.Alimentarse();
        perroServicio.Alimentarse();
        caballoServicio.Alimentarse();
    }
    
}
