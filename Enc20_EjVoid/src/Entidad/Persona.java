/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Persona {
    public String name;
    public int edad;
    Scanner leer = new Scanner (System.in);
    
    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public Persona() {
    }
    
    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    
}
