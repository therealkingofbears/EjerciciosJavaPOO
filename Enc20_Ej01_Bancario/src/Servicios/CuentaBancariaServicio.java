/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author diego
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner (System.in);
    CuentaBancaria c1 = new CuentaBancaria();
    
    public CuentaBancaria crearCuenta() {
        
        Random cta = new Random(System.currentTimeMillis());
        
        c1.setNumeroCuenta(cta.nextInt(100));
        
        System.out.println("Ingrese el DNI del cliente");
        c1.setDniCliente(leer.nextLong());
        System.out.println("Usted ingresó el DNI " + c1.getDniCliente());
        
        System.out.println("Ingrese el monto del depósito inicial");
        c1.setSaldoActual(leer.nextDouble());
        System.out.println("Usted ingresó $" + c1.getSaldoActual());
                
        return c1;
    }
    
    public CuentaBancaria ingresar() {
        
        System.out.println("Ingresar el monto a depositar");
        double depo = leer.nextDouble();
        
        c1.setSaldoActual(c1.getSaldoActual() + depo);
        
        return c1;
    }
    
    public CuentaBancaria retirar() {
        
        System.out.println("Indique el monto a retirar");
        double retiro = leer.nextDouble();
        
        if (c1.getSaldoActual() - retiro >= 0) {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - c1.getSaldoActual());
            System.out.println("El monto ingresado excede al saldo; sólo se retiró el saldo");
        }
        
        return c1;
    }
    
    public CuentaBancaria extraccionRapida() {
        
        System.out.println("Con extracción rápida puede retirar hasta el 20% de su saldo");
        System.out.println("Indique el monto a retirar por extracción rápida");
        double extra = leer.nextDouble();
        
        do {
            System.out.println("El monto ingresado excede el límite del 20% de su saldo; por favor vuelva a ingresar el valor a retirar");
            extra = leer.nextDouble();
        } while (c1.getSaldoActual(c1.getSaldoActual() - extra < (0.8*c1.getSaldoActual())));
        
        c1.setSaldoActual(c1.getSaldoActual() - extra);
        
        return c1;
    }
    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo en su cuenta es $" + c1.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI: " + c1.getDniCliente());
        System.out.println("Saldo actual: " + c1.getSaldoActual());
    }
}
