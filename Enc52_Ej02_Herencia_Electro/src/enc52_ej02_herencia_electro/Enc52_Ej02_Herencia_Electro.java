/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc52_ej02_herencia_electro;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicio.ElectrodomesticoService;
import Servicio.LavadoraService;
import Servicio.TelevisorService;
import java.util.ArrayList;

public class Enc52_Ej02_Herencia_Electro {

    public static void main(String[] args) {
        ElectrodomesticoService electrodomesticoService = new ElectrodomesticoService();
        LavadoraService lavadoraService = new LavadoraService();
        TelevisorService televisorService = new TelevisorService();

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = lavadoraService.crearLavadora(1000, "Blanco", 'A', 10, 8);
        electrodomesticos.add(lavadora1);

        Lavadora lavadora2 = lavadoraService.crearLavadora(1500, "Negro", 'B', 12, 7);
        electrodomesticos.add(lavadora2);

        Televisor televisor1 = televisorService.crearTelevisor(2000, "Gris", 'C', 20,40, true);
        electrodomesticos.add(televisor1);

        Televisor televisor2 = televisorService.crearTelevisor(2500, "Plata", 'D', 30,50, false);
        electrodomesticos.add(televisor2);

        // Recorrer el ArrayList y ejecutar precioFinal() para cada electrodoméstico
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomesticoService.precioFinal(electrodomestico);
        }
        
        // Imprimir lista de precios y calcular suma
        double sumaPrecios = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println("Precio: " + electrodomestico.getPrecio());
            sumaPrecios += electrodomestico.getPrecio();
        }
        System.out.println("Suma de precios: " + sumaPrecios);
    }
}

    

