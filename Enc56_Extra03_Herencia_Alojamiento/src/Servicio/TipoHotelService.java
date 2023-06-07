/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Hotel;
import Entidades.TipoHotel;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class TipoHotelService {
    TipoHotel ho1 = new TipoHotel();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Hotel crearHotel() {
        System.out.println("Ingrese el nombre del hotel");
        ho1.setNombre(leer.next());
        
        System.out.println("Ingrese la dirección del hotel");
        ho1.setDireccion(leer.next());
        
        System.out.println("Ingrese la localidad en donde se encuentra el hotel");
        ho1.setLocalidad(leer.next());
        
        System.out.println("Ingrese el nombre del gerente encargado del hotel");
        ho1.setGerente(leer.next());
        
        System.out.println("Ingrese la cantidad de habitaciones del hotel");
        ho1.setCantHabitaciones(leer.nextInt());
        
        System.out.println("Ingrese el número de camas del hotel");
        ho1.setCantCamas(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de pisos del hotel");
        ho1.setCantPisos(leer.nextInt());
        
        System.out.println("Ingrese si la categoría del gimnasio del hotel es A o B. Si no hay gimnasio, ingrese N");
        ho1.setGimnasio(leer.next().toUpperCase().charAt(0));
        
        while (ho1.getGimnasio() != 'A' && ho1.getGimnasio() != 'B' && ho1.getGimnasio() != 'N') {
            System.out.println("La categoría de gimnaiso ingresada es incorrecta. Vuelva a ingresar A o B, o ingrese N si no hay gimnasio");
            ho1.setGimnasio(leer.next().toUpperCase().charAt(0));
        }
        
        System.out.println("Ingrese el nombre del restaurante del hotel");
        ho1.setNombreResto(leer.next());
        
        System.out.println("Ingrese la capacidad del restaurante del hotel en cantidad de personas");
        ho1.setCapacidadResto(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de salones de conferencias que posee el hotel");
        ho1.setCantSalones(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de suites que posee el hotel");
        ho1.setCantSuites(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de limosinas que posee el hotel");
        ho1.setCantLimosinas(leer.nextInt());
        
        return new Hotel();
    }
    
    public void llenarPrecio() {
        double precioInicial = 50;
        int valResto = 0;
        int valGym = 0;
        int valLimo = ho1.getCantLimosinas()*15;

        if (ho1.getCapacidadResto() < 30) {
            valResto = 10;
        } else if (ho1.getCapacidadResto() >= 30 && ho1.getCapacidadResto() <= 50) {
            valResto = 30;
        } else if (ho1.getCapacidadResto() > 50) {
            valResto = 50;
        }
        
        if (ho1.getGimnasio() == 'A') {
            valGym = 50;
        } else if (ho1.getGimnasio() == 'B') {
            valGym = 30;
        } else if (ho1.getGimnasio() == 'N') {
            valGym = 0;
        }
        
        ho1.setPrecioHabitaciones(precioInicial + (double) valResto + (double) valGym + (double) valLimo + (double) ho1.getCantHabitaciones());
    }
}
