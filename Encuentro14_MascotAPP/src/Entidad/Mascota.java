/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author diego
 */
public class Mascota {
    public String nombre;
    public String apodo;
    public String tipo; //conejo, perro, gato, loro, carpincho
    public int edad;
    public boolean cola;
    public String raza;
    
    private int energia;
    
    public Mascota(String nombre, String apodo, String tipo) { //El constructor se diferencia de otros constructores con el mismo nombre por sus argumentos
        this.nombre = nombre; //this se usa para hacer referencia a un objeto y no a cualquier variable
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String raza, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = energia;
    }

    public Mascota() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public void setNombre(String nombre) { //el set se usa cuando queremos llamar a un atributo encapsulado
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    public int pasear(int energiaRestar) {
        energia = energia - energiaRestar;
                energia -= energiaRestar;
        return energia;
    }



    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + '}';
    }
    
    
    
}
