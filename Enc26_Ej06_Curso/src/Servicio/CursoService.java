/*
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 */
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CursoService {
    Scanner leer = new Scanner (System.in);
    Curso cu1 = new Curso();
    
    public String[] cargarAlumnos(Curso cu1) {
        String[] alumnos = cu1.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1) + ": ");
            String nombre = leer.nextLine();
            alumnos[i] = nombre;
            cu1.setAlumnos(alumnos);
         }
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(" [ " + alumnos[i] + " ] ");
            System.out.println("");
        }
        return alumnos;
    }
    
    public void crearCurso(Curso cu1) {
        System.out.println("Ingrese el nombre del curso");
        cu1.setNombreCurso(leer.next());
        
        System.out.println("Ingrese la cantidad de horas por día del curso");
        cu1.setCantidadHorasPorDia(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingrese la cantidad de días por semana del curso");
        cu1.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("Ingrese el precio por hora del curso");
        cu1.setPrecioPorHora(leer.nextDouble());
        
        System.out.println("Ingrese el turno ('m' para turno mañana/'t' para turno tarde)");
        cu1.setTurno(leer.next());
    }
    
    public void calcularGananciaSemanal(Curso cu1) { 
        double gan = cu1.getPrecioPorHora()*cu1.getCantidadHorasPorDia()*cu1.getCantidadDiasPorSemana()*cu1.getAlumnos().length;
        System.out.println("La ganancia es igual a $" + gan);
    }
}
