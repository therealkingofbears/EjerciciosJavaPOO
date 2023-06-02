/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(int precio, String color, char consumoEnergetico, int peso, int pulgadas, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Getters y Setters

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
