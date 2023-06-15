/*
Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package Entidades;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author diego
 */
public class Poliza {
    private int numero;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantCuotas;
    private String formaPago;
    private int montoAsegurado;
    private boolean incluyeGranizo;
    private int montoGranizo;
    private String tipoCobertura;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private List<Cuota> cuotas;

    public Poliza() {
    }
    
    public Poliza(int numero, Date fechaInicio, Date fechaFin, int cantCuotas, String formaPago, int montoAsegurado, boolean incluyeGranizo, int montoGranizo, String tipoCobertura, Vehiculo vehiculo, Cliente cliente, List<Cuota> cuotas) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.cuotas = new ArrayList<>();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaInicio() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fechaInicio);
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fechaFin);
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numero=" + numero + ", fechaInicio=" + getFechaInicio() + ", fechaFin=" + getFechaFin() + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoAsegurado=" + montoAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", cuotas=" + cuotas + '}';
    }
    

    
    
    
}
