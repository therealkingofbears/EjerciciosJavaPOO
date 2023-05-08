/*

 */
package Servicio;

import Entidades.Pais;
import java.util.*;
/**
 *
 * @author diego
 */
public class PaisServicio {

    private HashSet<Pais> pa = new HashSet<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Comparator<Pais> comp1 = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getPais().compareToIgnoreCase(p2.getPais());
        }
    };

        public HashSet<Pais> guardarPaises() {
            String opc = "S";

            while (!"N".equals(opc)) {
                Pais ps = new Pais();

                System.out.println("Ingrese un país");
                String pais = leer.next();

                ps.setPais(pais);

                pa.add(ps);

                System.out.println("Quiere ingresar otro país? Responda <S> para sí, o <N> para no");
                opc = leer.next().toUpperCase();

                while (!"S".equalsIgnoreCase(opc) && !"N".equalsIgnoreCase(opc)) {
                    System.out.println("Opción inválida. Ingrese S o N.");
                    opc = leer.next().toUpperCase();
                }
            }

            System.out.println("----------");
            System.out.println("Lista de países");

            for (Pais lista : pa) {
                System.out.println(lista);
            }

            return pa;
        }

        public void ordenarPaises() {
            ArrayList<Pais> paises = new ArrayList<>(pa);
            paises.sort(comp1);
            
            System.out.println("----------");
            System.out.println("Lista de países ordenada");
            
            for (Pais pais : paises) {
                System.out.println(pais);
            }
        }

        public void eliminarPais() {
            Iterator<Pais> it = pa.iterator();
            System.out.println("Ingrese un país a eliminar");
            String elim = leer.next();
            boolean encontrar = false;

            while (it.hasNext()) {
                Pais p = it.next();
                if (p.getPais().equalsIgnoreCase(elim)) {
                    it.remove();
                    encontrar = true;
                }
            }

            if (encontrar) {
                System.out.println("El país elegido se ha eliminado");
            } else {
                System.out.println("No se encuentra el país");
            }
            
            ordenarPaises();
            
        }

}
