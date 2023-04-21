/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc15extra05;

import Entidad.Empleado;

/**
 *
 * @author diego
 */
public class Enc15Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        
        emp.ingresar_empleado();
        emp.calcular_aumento();
    }
    
}
