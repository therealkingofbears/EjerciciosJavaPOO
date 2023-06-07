/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Camping extends Alojamiento {
    private int maxCarpas;
    private boolean resto;
    private int cantBanios;

    public Camping() {
    }

    public Camping(int maxCarpas, boolean resto, int cantBanios, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.resto = resto;
        this.cantBanios = cantBanios;
    }


    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }
    
    

    @Override
    public String toString() {
        return "Camping{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                ", maxCarpas=" + maxCarpas + '\'' +
                ", cantBanios=" + cantBanios + '\'' +
                ", resto=" + resto +
                '}';
    }
}
