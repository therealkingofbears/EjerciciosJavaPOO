/*

 */
package Servicio;

import Entidades.Producto;
import java.util.*;


/**
 *
 * @author diego
 */
public class ProductoServicio {

    private HashMap<String, Double> map = new HashMap<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto agregarProducto() {
        Producto prod = new Producto();

        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        prod.setNombre(nombre);

        System.out.println("Ingrese el precio del producto");
        double precio = leer.nextDouble();
        prod.setPrecio(precio);

        map.put(prod.getNombre(), prod.getPrecio());

        System.out.println("El producto ha sido agregado correctamente");

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + " ; Precio: $" + entry.getValue());
        }

        return prod;
    }

    public void modificarPrecio() {
        String clave;
        double precio;
        System.out.println("Ingrese el nombre del producto cuyo precio quiere modificar");
        clave = leer.next();

        while (!map.containsKey(clave)) {
            System.out.println("El nombre del producto no ha sido ingresado; por favor vuelva a intentarlo");
            clave = leer.next();
        }

        System.out.println("Ingrese el nuevo precio del producto");
        precio = leer.nextDouble();

        map.put(clave, precio);

        System.out.println("El precio del producto ha sido modificado correctamente");

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + " ; Precio: $" + entry.getValue());
        }
    }

    public void eliminarProducto() {
        String clave;
        System.out.println("Ingrese el nombre del producto que quiere eliminar");
        clave = leer.next();

        map.remove(clave);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + " ; Precio: $" + entry.getValue());
        }
    }

    public void mostrarProductos() {
        System.out.println("-----");
        System.out.println("Lista de Productos");
        System.out.println("-----");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + " ; Precio: $" + entry.getValue());
        }
    }
}

