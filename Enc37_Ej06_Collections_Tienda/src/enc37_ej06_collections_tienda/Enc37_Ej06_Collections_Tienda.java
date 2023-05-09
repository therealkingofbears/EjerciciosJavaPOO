/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enc37_ej06_collections_tienda;

import Entidades.Producto;
import Servicio.ProductoServicio;
import java.util.*;

/**
 *
 * @author diego
 */
public class Enc37_Ej06_Collections_Tienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ProductoServicio ps = new ProductoServicio();

        int opc = 0;

        System.out.println("MENÚ PRINCIPAL");
        System.out.println("----------------------");
        System.out.println("Ingrese la opción que desea utilizando un número de 1 a 5");
        System.out.println("1. Crear Producto");
        System.out.println("2. Modificar el precio de un Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Mostrar la lista de Productos y Precios");
        System.out.println("5. Salir");
        opc = leer.nextInt();

        while (opc < 1 || opc > 5) {
            System.out.println("La opción ingresada es incorrecta. Por favor vuelva a ingresar la opción deseada");
            opc = leer.nextInt();
        }

        while (opc >= 1 && opc <= 4) {
            switch (opc) {
                case 1:
                    Producto prod = ps.agregarProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
            }
            
            System.out.println("Ingrese la opción que desea utilizar");
            opc = leer.nextInt();
        }

        System.out.println("Gracias por utilizar la lista de Productos");

    }
}
