/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc26_ej06_curso;

import Entidades.Curso;
import Servicio.CursoService;

/**
 *
 * @author diego
 */
public class Enc26_Ej06_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Curso c1 = new Curso();
       CursoService cs1 = new CursoService();
       
       cs1.cargarAlumnos(c1);
       cs1.crearCurso(c1);
       cs1.calcularGananciaSemanal(c1);
    }
    
}
