//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package pkg06ejercicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Servicio {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Double> almacen = new HashMap();

    public void ingresarProductos() {
        String agregar;

        do {

            System.out.println("Ingrese el producto");
            String producto = entrada.next();

            System.out.println("Ingrese el precio");
            Double precio = entrada.nextDouble();

            almacen.put(producto, precio);

            System.out.println("Desea agregar otro producto?");
            agregar = entrada.next();

        } while (agregar.equalsIgnoreCase("si"));

        System.out.println(almacen);

    }

    public void modificarPrecio() {

        System.out.println("Ingrese un producto para modificar su precio");
        String buscarProducto = entrada.next();

        if (almacen.containsKey(buscarProducto)) {
            System.out.println("Ingrese el valor");
            Double precioNuevo = entrada.nextDouble();
            almacen.replace(buscarProducto, precioNuevo);
        } else {
            System.out.println("No existe papu");
        }

        System.out.println(almacen);
    }

    public void eliminarProducto() {

        System.out.println("Ingrese el producto a eliminar");
        String producto = entrada.next();

        if (almacen.containsKey(producto)) {
            almacen.remove(producto);
        } else {
            System.out.println("El producto no se encuentra mi rey");
        }

        System.out.println(almacen);
    }

    public void menu() {

        int opcion;

        do {
            System.out.println("Ingrese la opcion \n 1: Agregar producto \n 2: Modificar producto \n 3: Eliminar producto \n 4:Salir");
             opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    ingresarProductos();
                    break;

                case 2:
                    modificarPrecio();
                    break;

                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    System.out.println("Gracias vuelvas prontos");
                    break;
                default:
                    System.out.println("Que no sabes leer??!!! pancho..."); 
            }

        } while (opcion != 4);
        System.out.println(almacen);
    }

}
