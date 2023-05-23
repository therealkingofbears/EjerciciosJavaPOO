/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.*;

/**
 *
 * @author diego
 */
public class Baraja {
    private List<Carta> cartas;
    private int indiceActual = 0;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void barajar() {
        Collections.shuffle(cartas);

        System.out.println("---------------");
        System.out.println("BARAJADO");
        System.out.println("---------------");

        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
    
    public Carta siguienteCarta() {
        if (indiceActual < cartas.size()) {
            Carta siguienteCarta = cartas.get(indiceActual);
            indiceActual++;
            return siguienteCarta;
        } else {
            System.out.println("---------------");
            System.out.println("Se agotaron todas las cartas");
            return null;
        }
    }

    public void cartasDisponibles() {
        int disponibles = cartas.size() - indiceActual;
        System.out.println("---------------");
        System.out.println("Quedan " + disponibles + " cartas disponibles");
    }
    
    /*
    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario
    */
    
    public void darCartas() {
        int cant;
        do {
            System.out.println("Indique cuántas cartas necesita");
            cant = leer.nextInt();

            if (cant <= 0) {
                System.out.println("La cantidad de cartas solicitada no es válida.");
            }
        } while (cant <= 0);

        if (indiceActual + cant <= cartas.size()) {
            List<Carta> cartasEntregadas = cartas.subList(indiceActual, indiceActual + cant);
            indiceActual += cant;

            System.out.println("---------------");
            System.out.println("Cartas entregadas:");
            for (Carta carta : cartasEntregadas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No hay suficientes cartas disponibles.");
        }
    }
    
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
    
    public void cartasMonton() {
        if (indiceActual == 0) {
            System.out.println("No se ha entregado ninguna carta.");
            return;
        }

        System.out.println("---------------");
        System.out.println("Cartas en el montón:");
        for (int i = 0; i < indiceActual; i++) {
            System.out.println(cartas.get(i));
        }
    }
    
    public void mostrarBaraja() {
        System.out.println("---------------");
        System.out.println("Cartas en la baraja:");
        for (int i = indiceActual; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    }
}
