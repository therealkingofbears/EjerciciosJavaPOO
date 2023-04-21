/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

/**
 *
 * @author diego
 */
public class Enc06EjExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 8;
        int B = 6;
        int C = 4;
        int D = 2;
        
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D = " + D);
        
        int aux = B;
        B = C;
        System.out.println("B = " + B);
        C = A;
        System.out.println("C = " + C);
        A = D;
        System.out.println("A = " + A);
        D = aux;
        System.out.println("D = " + D);
                
        
    }
    
}
