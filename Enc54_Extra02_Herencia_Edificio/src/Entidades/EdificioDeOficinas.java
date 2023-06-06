/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class EdificioDeOficinas extends Edificio {
    private Integer numOficinas;
    private Integer personasOficina;
    private Integer cantPisos;

    public EdificioDeOficinas(Integer numOficinas, Integer personasOficina, Integer cantPisos) {
        this.numOficinas = numOficinas;
        this.personasOficina = personasOficina;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas(Integer numOficinas, Integer personasOficina, Integer cantPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasOficina = personasOficina;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas() {
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getPersonasOficina() {
        return personasOficina;
    }

    public void setPersonasOficina(Integer personasOficina) {
        this.personasOficina = personasOficina;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }
}
