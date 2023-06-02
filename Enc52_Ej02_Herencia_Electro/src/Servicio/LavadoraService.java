/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

public class LavadoraService extends ElectrodomesticoService {

    public Lavadora crearLavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        Electrodomestico electrodomestico = crearElectrodomestico(precio, color, consumoEnergetico, peso);
        Lavadora lavadora = new Lavadora();
        lavadora.setPrecio(electrodomestico.getPrecio());
        lavadora.setColor(electrodomestico.getColor());
        lavadora.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        lavadora.setPeso(electrodomestico.getPeso());
        lavadora.setCarga(carga);
        return lavadora;
    }

    public double calcularPrecioPorCarga(double carga) {
        double precio = 0;

        if (carga > 30) {
            precio += 50;
        }

        return precio;
    }
    
    public double precioFinal(Lavadora lavadora) {
        double precioFinal = super.precioFinal(lavadora);

        precioFinal += calcularPrecioPorCarga(lavadora.getCarga());

        return precioFinal;
    }
}



