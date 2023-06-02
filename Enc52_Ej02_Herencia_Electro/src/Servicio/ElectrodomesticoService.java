/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

public class ElectrodomesticoService {
    public Electrodomestico crearElectrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        Electrodomestico electrodomestico = new Electrodomestico(precio, color, consumoEnergetico, peso);
        return electrodomestico;
    }
    
    public double precioFinal(Electrodomestico electrodomestico) {
        double precioFinal = electrodomestico.getPrecio();

        precioFinal += calcularPrecioPorConsumo(electrodomestico.getConsumoEnergetico());
        precioFinal += calcularPrecioPorPeso(electrodomestico.getPeso());

        return precioFinal;
    }

    public double calcularPrecioPorConsumo(char consumo) {
        double precio = 0;

        switch (Character.toUpperCase(consumo)) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
            default:
                break;
        }

        return precio;
    }

    public double calcularPrecioPorPeso(int peso) {
        double precio = 0;

        if (peso >= 1 && peso <= 19) {
            precio += 10;
        } else if (peso >= 20 && peso <= 49) {
            precio += 50;
        } else if (peso >= 50 && peso <= 79) {
            precio += 80;
        } else if (peso >= 80) {
            precio += 100;
        }

        return precio;
    }

    public double precioFinal(Lavadora lavadora) {
        double precioFinal = precioFinal((Electrodomestico) lavadora);

        precioFinal += calcularPrecioPorCarga(lavadora.getCarga());

        return precioFinal;
    }

    public double calcularPrecioPorCarga(double carga) {
        double precio = 0;

        if (carga > 30) {
            precio += 50;
        }

        return precio;
    }

    public double precioFinal(Televisor televisor) {
        double precioFinal = precioFinal((Electrodomestico) televisor);

        if (televisor.getPulgadas() > 40) {
            precioFinal += precioFinal * 0.3;
        }

        if (televisor.isSintonizadorTDT()) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}

