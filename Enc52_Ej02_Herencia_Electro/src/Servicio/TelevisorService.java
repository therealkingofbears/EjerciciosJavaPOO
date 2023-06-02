/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Televisor;

public class TelevisorService extends ElectrodomesticoService {

    public Televisor crearTelevisor(int precio, String color, char consumoEnergetico, int peso, int pulgadas, boolean sintonizadorTDT) {
        Electrodomestico electrodomestico = crearElectrodomestico(precio, color, consumoEnergetico, peso);
        Televisor televisor = new Televisor();
        televisor.setPrecio(electrodomestico.getPrecio());
        televisor.setColor(electrodomestico.getColor());
        televisor.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        televisor.setPeso(electrodomestico.getPeso());
        televisor.setPulgadas(pulgadas);
        televisor.setSintonizadorTDT(sintonizadorTDT);
        return televisor;
    }

    public double precioFinal(Televisor televisor) {
        double precioFinal = super.precioFinal(televisor);

        if (televisor.getPulgadas() > 40) {
            precioFinal += precioFinal * 0.3;
        }

        if (televisor.isSintonizadorTDT()) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}

