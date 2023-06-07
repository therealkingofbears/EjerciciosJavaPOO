/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc56_extra03_herencia_alojamiento;


import Entidades.*;
import Servicio.*;
import java.util.*;

/**
 *
 * @author diego
 */
public class Enc56_Extra03_Herencia_Alojamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        // Crear alojamientos
        TipoHotelService tipoHotelService = new TipoHotelService();
        Hotel hotel1 = tipoHotelService.crearHotel();
        alojamientos.add(hotel1);

        CampingService campingService = new CampingService();
        Camping camping1 = campingService.crearCamping();
        alojamientos.add(camping1);

        ResidenciaService residenciaService = new ResidenciaService();
        Residencia residencia1 = residenciaService.crearResidencia();
        alojamientos.add(residencia1);

        // Consultar alojamientos
        System.out.println("=== Todos los Alojamientos ===");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }

        System.out.println("\n=== Todos los Hoteles de más caro a más barato ===");
        Collections.sort(alojamientos, new Comparator<Alojamiento>() {
            @Override
            public int compare(Alojamiento a1, Alojamiento a2) {
                if (a1 instanceof Hotel && a2 instanceof Hotel) {
                    Hotel h1 = (Hotel) a1;
                    Hotel h2 = (Hotel) a2;
                    return Double.compare(h2.getPrecioHabitaciones(), h1.getPrecioHabitaciones());
                }
                return 0;
            }
        });

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                System.out.println(alojamiento);
            }
        }

        System.out.println("\n=== Todos los Campings con restaurante ===");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isResto()) {
                    System.out.println(alojamiento);
                }
            }
        }

        System.out.println("\n=== Todas las Residencias que tienen descuento ===");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.isDescGremio()) {
                    System.out.println(alojamiento);
                }
            }
        }
    }

    
}
