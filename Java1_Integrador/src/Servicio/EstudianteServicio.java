/*


 */
package Servicio;

import Entidades.Estudiante;
import java.util.*;

/**
 *
 * @author diego
 */
public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante cargarEstudiantes(Estudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
            estudianteObj[i] = new Estudiante();
            Random r = new Random();
            System.out.println("Ingrese el nombre del estudiante número " + (i+1) + ":");
            estudianteObj[i].setNombre(leer.next());
            
            System.out.println("Nota del estudiante: ");
            estudianteObj[i].setNota(r.nextFloat() * (10 - 4) + 4);
            System.out.println(estudianteObj[i].getNota());
            System.out.println();
        }
        
        return new Estudiante();
    }
    
    public void mostrarEstudiantes(Estudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
//            System.out.println(estudianteObj[i].toString());
            System.out.println("Nombre :" + estudianteObj[i].getNombre() + "  |  Nota: " + estudianteObj[i].getNota());
        }
    }
    
    public double promedioEstudiantes(Estudiante[] estudianteObj) {
        double suma = 0;
        double promedio = 0;
        
        for (int i = 0; i < estudianteObj.length; i++) {
            suma += estudianteObj[i].getNota();
        }
        
        promedio = suma / estudianteObj.length;
        
        return promedio;
    }
    
 //Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso
    
    public String[] estudiantesArribapromedio(Estudiante[] estudianteObj) {
        int cont = 0;
        
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > promedioEstudiantes(estudianteObj)) {
                cont++;
            }
        }
        
        String[] alumnos = new String[cont];
        
        int j = 0;
        
        for (int i = 0; i < estudianteObj.length; i++) {
            if(estudianteObj[i].getNota() > promedioEstudiantes(estudianteObj)) {
                alumnos[j] = estudianteObj[i].getNombre();
                j++;
            }
        }
        return alumnos;
    }
    
    //Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    
    public void mostrarAlumnosArribaPromedio(Estudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > promedioEstudiantes(estudianteObj)) {
                System.out.println(estudianteObj[i].getNombre() + " , " + estudianteObj[i].getNota());
            }
        }
    }
    
}
