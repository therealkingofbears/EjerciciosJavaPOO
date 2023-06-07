/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Residencia extends Alojamiento {
    private boolean descGremio;
    private int cantHab;
    private boolean campoDep;

    public Residencia() {
    }

    public Residencia(boolean descGremio, int cantHab, boolean campoDep, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.descGremio = descGremio;
        this.cantHab = cantHab;
        this.campoDep = campoDep;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isCampoDep() {
        return campoDep;
    }

    public void setCampoDep(boolean campoDep) {
        this.campoDep = campoDep;
    }


    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    @Override
    public String toString() {
        return "Residencia{" + "descGremio=" + descGremio + ", cantHab=" + cantHab + ", campoDep=" + campoDep + '}';
    }

    
}
