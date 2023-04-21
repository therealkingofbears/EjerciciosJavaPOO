/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class RaicesServicio {
    Raices r = new Raices();
    Scanner leer = new Scanner(System.in);
    
    public Raices coeficientes() {
        System.out.println("Ingrese el valor para el coeficiente a");
        r.setA(leer.nextInt());
        
        System.out.println("Ingrese el valor para el coeficiente b");
        r.setB(leer.nextInt());
        
        System.out.println("Ingrese el valor para el coeficiente c");
        r.setC(leer.nextInt());
        
        System.out.println("La ecuación cuadrática ingresada es " + r.getA() + "x^2 + " + r.getB() + "x + " + r.getC());
        
        return r;
    }
    
    public double getDiscriminante(Raices r) {
        double dis = (Math.pow(r.getB(),2) - 4*r.getA()*r.getC());
        return dis;
    }
    
    public boolean tieneRaices(Raices r) {
        boolean sol = false;
        if (getDiscriminante(r) > 0) {
            sol = true;
        }
        return sol;
    }
    
    public boolean tieneRaiz(Raices r) {
        boolean mas = false;
        if (getDiscriminante(r) == 0) {
            mas = true;
        }
        return mas;
    }
    
    public void obtenerRaices(Raices r) {
        if (tieneRaices(r) == true) {
            double raiz = Math.sqrt(getDiscriminante(r));
            double x1 = (-r.getB()+raiz)/(2*r.getA());
            double x2 = (-r.getB()-raiz)/(2*r.getA());
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    
    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r) == true) {
            double x = (-r.getB()/(2*r.getA()));
            System.out.println("x = " + x);
        }
    }
    
    public void calcular(Raices r) {
        if (tieneRaices(r) == true) {
            obtenerRaices(r);
        } else if (tieneRaiz(r) == true) {
            obtenerRaiz(r);
        } else if (tieneRaices(r) == false && tieneRaiz(r) == false) {
            System.out.println("No existen raíces para esta ecuación");
        }
    }
    
    
}
