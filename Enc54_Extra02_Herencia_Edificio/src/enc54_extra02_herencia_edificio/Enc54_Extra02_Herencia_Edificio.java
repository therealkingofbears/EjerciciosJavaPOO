/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc54_extra02_herencia_edificio;

import Entidades.Edificio;
import Servicio.EdificioDeOficinasService;
import Servicio.PolideportivoService;
import java.util.*;

/**
 *
 * @author diego
 */
public class Enc54_Extra02_Herencia_Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PolideportivoService ps1 = new PolideportivoService();
        EdificioDeOficinasService eos1 = new EdificioDeOficinasService();

        ArrayList<Edificio> edificios = new ArrayList<>();

        ps1.crearPolideportivo();
        eos1.crearEdificioDeOficinas();

        edificios.add(ps1.getPolideportivo());
        edificios.add(eos1.getEdificioDeOficinas());
        
        for (Edificio edificio : edificios) {
            System.out.println("Ancho: " + edificio.getAncho());
            System.out.println("Alto: " + edificio.getAlto());
            System.out.println("Largo: " + edificio.getLargo());
            System.out.println();
        }
        
        eos1.cantPersonas();
    }
    
}
