/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
 */
package enc45_ej03_relaciones_baraja;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.*;

/**
 *
 * @author diego
 */
public class Enc45_Ej03_Relaciones_Baraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta carta1 = new Carta(1, "Espada");
        Carta carta2 = new Carta(2, "Espada");
        Carta carta3 = new Carta(3, "Espada");
        Carta carta4 = new Carta(4, "Espada");
        Carta carta5 = new Carta(5, "Espada");
        Carta carta6 = new Carta(6, "Espada");
        Carta carta7 = new Carta(7, "Espada");
        Carta carta8 = new Carta(10, "Espada");
        Carta carta9 = new Carta(11, "Espada");
        Carta carta10 = new Carta(12, "Espada");
        Carta carta11 = new Carta(1, "Basto");
        Carta carta12 = new Carta(2, "Basto");
        Carta carta13 = new Carta(3, "Basto");
        Carta carta14 = new Carta(4, "Basto");
        Carta carta15 = new Carta(5, "Basto");
        Carta carta16 = new Carta(6, "Basto");
        Carta carta17 = new Carta(7, "Basto");
        Carta carta18 = new Carta(10, "Basto");
        Carta carta19 = new Carta(11, "Basto");
        Carta carta20 = new Carta(12, "Basto");
        Carta carta21 = new Carta(1, "Oro");
        Carta carta22 = new Carta(2, "Oro");
        Carta carta23 = new Carta(3, "Oro");
        Carta carta24 = new Carta(4, "Oro");
        Carta carta25 = new Carta(5, "Oro");
        Carta carta26 = new Carta(6, "Oro");
        Carta carta27 = new Carta(7, "Oro");
        Carta carta28 = new Carta(10, "Oro");
        Carta carta29 = new Carta(11, "Oro");
        Carta carta30 = new Carta(12, "Oro");
        Carta carta31 = new Carta(1, "Copa");
        Carta carta32 = new Carta(2, "Copa");
        Carta carta33 = new Carta(3, "Copa");
        Carta carta34 = new Carta(4, "Copa");
        Carta carta35 = new Carta(5, "Copa");
        Carta carta36 = new Carta(6, "Copa");
        Carta carta37 = new Carta(7, "Copa");
        Carta carta38 = new Carta(10, "Copa");
        Carta carta39 = new Carta(11, "Copa");
        Carta carta40 = new Carta(12, "Copa");
        
        ArrayList<Carta> carta = new ArrayList<>();
        carta.add(carta1);
        carta.add(carta2);
        carta.add(carta3);
        carta.add(carta4);
        carta.add(carta5);
        carta.add(carta6);
        carta.add(carta7);
        carta.add(carta8);
        carta.add(carta9);
        carta.add(carta10);
        carta.add(carta11);
        carta.add(carta12);
        carta.add(carta13);
        carta.add(carta14);
        carta.add(carta15);
        carta.add(carta16);
        carta.add(carta17);
        carta.add(carta18);
        carta.add(carta19);
        carta.add(carta20);
        carta.add(carta21);
        carta.add(carta22);
        carta.add(carta23);
        carta.add(carta24);
        carta.add(carta25);
        carta.add(carta26);
        carta.add(carta27);
        carta.add(carta28);
        carta.add(carta29);
        carta.add(carta30);
        carta.add(carta31);
        carta.add(carta32);
        carta.add(carta33);
        carta.add(carta34);
        carta.add(carta35);
        carta.add(carta36);
        carta.add(carta37);
        carta.add(carta38);
        carta.add(carta39);
        carta.add(carta40);
        
        Baraja baraja = new Baraja();
        baraja.setCartas(carta);
        
        List<Carta> cartasBarajadas = baraja.getCartas();
        for (Carta cart : cartasBarajadas) {
            System.out.println(cart);
        }
        
        baraja.barajar();
        baraja.siguienteCarta();
        baraja.cartasDisponibles();
        baraja.darCartas();
        baraja.cartasDisponibles();
        baraja.cartasMonton();
        baraja.mostrarBaraja();

    }
    
}
