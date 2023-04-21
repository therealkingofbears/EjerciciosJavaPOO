/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Cuenta {
    public int saldo = 500;
    public String titular;
    
    public void retirar_dinero() {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el monto a extraer");
        int extraer = leer.nextInt();
        
        if ((saldo - extraer) <= 0) {
            System.out.println("El saldo es insuficiente para realizar esta transacción");
        } else {
            System.out.println("Usted extrajo $" + extraer + " y el saldo remanente es igual a $" + (saldo - extraer));
        }
    }
}
