/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Edificio;

/**
 *
 * @author diego
 */
public abstract class EdificioService {
    protected Edificio e1 = new Edificio();
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
}
