/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc20_ej01_bancario;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc20_Ej01_Bancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        CuentaBancariaServicio cb = new CuentaBancariaServicio();
        
        CuentaBancaria c1 = cb.crearCuenta();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Elija la opción a la que quiera acceder con un número de 1 a 6");
        System.out.println("1. Ingresar dinero a su cuenta");
        System.out.println("2. Extracción simple");
        System.out.println("3. Extracción rápida (hasta el 20% del saldo");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar los datos de la cuenta");
        System.out.println("6. Salir");
        
        int opc = leer.nextInt();
        
        do {
            switch (opc) {
            case 1:
                c1 = cb.ingresar();
                System.out.println("Elija la opción a la que quiera acceder con un número de 1 a 6");
                System.out.println("1. Ingresar dinero a su cuenta");
                System.out.println("2. Extracción simple");
                System.out.println("3. Extracción rápida (hasta el 20% del saldo");
                System.out.println("4. Consultar saldo");
                System.out.println("5. Consultar los datos de la cuenta");
                System.out.println("6. Salir");
        
                opc = leer.nextInt();
              break;
            case 2:
                c1 = cb.retirar();
                System.out.println("Elija la opción a la que quiera acceder con un número de 1 a 6");
                System.out.println("1. Ingresar dinero a su cuenta");
                System.out.println("2. Extracción simple");
                System.out.println("3. Extracción rápida (hasta el 20% del saldo");
                System.out.println("4. Consultar saldo");
                System.out.println("5. Consultar los datos de la cuenta");
                System.out.println("6. Salir");
        
                opc = leer.nextInt();
              break;
            case 3:
                c1 = cb.extraccionRapida();
                System.out.println("Elija la opción a la que quiera acceder con un número de 1 a 6");
                System.out.println("1. Ingresar dinero a su cuenta");
                System.out.println("2. Extracción simple");
                System.out.println("3. Extracción rápida (hasta el 20% del saldo");
                System.out.println("4. Consultar saldo");
                System.out.println("5. Consultar los datos de la cuenta");
                System.out.println("6. Salir");
        
                opc = leer.nextInt();
              break;
            case 4:
                cb.consultarSaldo(c1);
                System.out.println("Elija la opción a la que quiera acceder con un número de 1 a 6");
                System.out.println("1. Ingresar dinero a su cuenta");
                System.out.println("2. Extracción simple");
                System.out.println("3. Extracción rápida (hasta el 20% del saldo");
                System.out.println("4. Consultar saldo");
                System.out.println("5. Consultar los datos de la cuenta");
                System.out.println("6. Salir");
        
                opc = leer.nextInt();
              break;
            case 5:
                cb.consultarDatos(c1);
                System.out.println("Elija la opción a la que quiera acceder con un número de 1 a 6");
                System.out.println("1. Ingresar dinero a su cuenta");
                System.out.println("2. Extracción simple");
                System.out.println("3. Extracción rápida (hasta el 20% del saldo");
                System.out.println("4. Consultar saldo");
                System.out.println("5. Consultar los datos de la cuenta");
                System.out.println("6. Salir");
        
                opc = leer.nextInt();
              break;
            }
        } while (opc != 6);
        
        
    }
    
}
