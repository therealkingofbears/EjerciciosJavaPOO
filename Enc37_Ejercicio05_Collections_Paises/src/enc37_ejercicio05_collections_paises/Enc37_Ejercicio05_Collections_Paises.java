/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc37_ejercicio05_collections_paises;

/**
 *
 * @author diego
 */
import Entidades.Pais;
import Servicio.*;
import java.util.HashSet;


public class Enc37_Ejercicio05_Collections_Paises {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        PaisServicio ps = new PaisServicio();
        HashSet<Pais> pa = ps.guardarPaises();
        ps.ordenarPaises();
        ps.eliminarPais();
    }
}