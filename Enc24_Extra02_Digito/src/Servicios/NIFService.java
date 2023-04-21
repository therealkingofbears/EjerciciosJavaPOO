/*
En NIFService
se dispondrá de los siguientes métodos:
a) Métodos getters y setters para el número de DNI y la letra.
b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class NIFService {
    Scanner leer = new Scanner (System.in);
    NIF n = new NIF();
    
    public String crearNif() {
        System.out.println("Ingrese el DNI");
        n.setDNI(leer.nextInt());
        
        int mod = (n.getDNI() % 23);
        
        
        
        String[] tabla = new String[23];
        
        
        tabla[0] = "T";
        tabla[1] = "R";
        tabla[2] = "W";
        tabla[3] = "A";
        tabla[4] = "G";
        tabla[5] = "M";
        tabla[6] = "Y";
        tabla[7] = "F";
        tabla[8] = "P";
        tabla[9] = "D";
        tabla[10] = "X";
        tabla[11] = "B";
        tabla[12] = "N";
        tabla[13] = "J";
        tabla[14] = "Z";
        tabla[15] = "S";
        tabla[16] = "Q";
        tabla[17] = "V";
        tabla[18] = "H";
        tabla[19] = "L";
        tabla[20] = "C";
        tabla[21] = "K";
        tabla[22] = "E";
        
        n.setNIF(tabla[mod]);
        
        return n.getNIF();

    }


    

    public void mostrar() {
        System.out.println(n.getDNI() + "-" + n.getNIF());
    }
}
