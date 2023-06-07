/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author diego
 */
public class TipoHotel extends Hotel {
    private char gimnasio;
    private String nombreResto;
    private int capacidadResto;
    private int cantSalones;
    private int cantSuites;
    private int cantLimosinas;

    public TipoHotel() {
    }

    public TipoHotel(char gimnasio, String nombreResto, int capacidadResto, int cantSalones, int cantSuites, int cantLimosinas, int cantHabitaciones, int cantCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    

    

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "TipoHotel{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                ", cantHabitaciones=" + cantHabitaciones +
                ", cantCamas=" + cantCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitaciones=" + precioHabitaciones +
                ", gimnasio=" + gimnasio +
                ", nombreResto='" + nombreResto + '\'' +
                ", capacidadResto=" + capacidadResto +
                ", cantSalones=" + cantSalones +
                ", cantSuites=" + cantSuites +
                ", cantLimosinas=" + cantLimosinas +
                '}';
    }
}

