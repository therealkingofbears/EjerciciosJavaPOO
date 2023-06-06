/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Polideportivo;
import java.util.*;

/**
 *
 * @author diego
 */
public class PolideportivoService extends EdificioService {
    private Polideportivo polideportivo = new Polideportivo();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPolideportivo() {
        System.out.println("Ingrese el nombre del polideportivo");
        polideportivo.setNombre(leer.next().toLowerCase());

        System.out.println("Ingrese si el predio es abierto o techado");
        polideportivo.setTipo(leer.next().toLowerCase());

        while (!"abierto".equals(polideportivo.getTipo()) && !"techado".equals(polideportivo.getTipo())) {
            System.out.println("La opción ingresada es incorrecta. Por favor, indique si el predio es abierto o techado");
            polideportivo.setTipo(leer.next().toLowerCase());
        }

        System.out.println("Ingrese el ancho del polideportivo");
        polideportivo.setAncho(leer.nextInt());

        System.out.println("Ingrese el largo del polideportivo");
        polideportivo.setLargo(leer.nextInt());

        System.out.println("Ingrese el alto del polideportivo");
        polideportivo.setAlto(leer.nextInt());
    }

    public Polideportivo getPolideportivo() {
        return polideportivo;
    }

    @Override
    public void calcularSuperficie() {
        Integer superficie = polideportivo.getAncho() * polideportivo.getLargo();
    }

    @Override
    public void calcularVolumen() {
        Integer volumen = polideportivo.getAlto() * polideportivo.getAncho() * polideportivo.getLargo();
    }
}
