/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber qué alumnos han recibido una nota por encima de ese promedio.

 */
package java1_integrador;

import Entidades.Estudiante;
import Servicio.EstudianteServicio;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Java1_Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio servicio = new EstudianteServicio();
        Estudiante[] estudianteObj = new Estudiante[8];
        
        //cargar alumnos
        
        servicio.cargarEstudiantes(estudianteObj);
        
        //Mostrar alumnos
        
        System.out.println("Alumnos: ");
        servicio.mostrarEstudiantes(estudianteObj);
        System.out.println();
        
        // Calcular promedio
        System.out.println("Promedio: " + servicio.promedioEstudiantes(estudianteObj));
        
        //Obtener alumnos con mayor promedio
        servicio.estudiantesArribapromedio(estudianteObj);
        String[] alumnos = servicio.estudiantesArribapromedio(estudianteObj);
        
        //Mostrar alumnos con mayor promedio
        System.out.println("Alumnos con notas mayor al promedio: ");
        System.out.println(Arrays.toString(alumnos));
        
        System.out.println();
        System.out.println("Nombre y nota: ");
        servicio.mostrarAlumnosArribaPromedio(estudianteObj);
    }
    
}
