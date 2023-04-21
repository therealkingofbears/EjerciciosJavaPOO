
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */

/**
 *
 * @author diego
 */
public class Enc06EjExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String socio;
        String A = "A";
        String B = "B";
        String C = "C";
        double costo;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tipo de socio (A,B o C)");
        socio = leer.next();
        
        
        do {
            System.out.println("La opción ingresada no corresponde a un tipo de socio");
            socio = leer.next();
            
        } while (!(socio.equals(A) || socio.equals(B) || socio.equals(C) || socio.equals("a") || socio.equals("b") || socio.equals("c") ));
        
        System.out.println("Ingrese el valor del tratamiento");
        costo = leer.nextDouble();
        
        switch (socio) {
            case "A": 
                System.out.println("El socio clase A deberá abonar $" + costo*0.5);
              break;
            case "B":
                System.out.println("El socio clase B deberá abonar $" + costo*0.65);
              break;
            case "C":
                System.out.println("El socio clase C deberá abonar $" + costo);
              break;
        }
                
    }
    
}
