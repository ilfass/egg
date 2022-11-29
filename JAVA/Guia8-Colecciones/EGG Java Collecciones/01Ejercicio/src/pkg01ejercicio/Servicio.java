//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
package pkg01ejercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> razas = new ArrayList();

    public Perro crearPerro() {

        Perro dog = new Perro();

        System.out.println("Ingrese el nombre del perro");
        dog.setNombre(entrada.next());

        System.out.println("Ingrese la raza");
        dog.setRazas(entrada.next());

        return dog;

    }

    public void guardarRaza() {

        String opcion = "";

        do {

            Perro dog = crearPerro();

            razas.add(dog.getRazas());
            System.out.println("Desea ingresar otra perro?");
            opcion = entrada.next();

        } while (opcion.equalsIgnoreCase("s"));

    }

    public void mostrarPerros() {

        razas.forEach((aux) -> System.out.println("La raza del perro es: " + aux)); //  For Each
        System.out.println("La cantidad de perros actual es: " + razas.size());

        // for (String aux : razas) {
        //   System.out.println(aux);
        //  }
    }

    public void borrarRaza() {
        boolean encontrado = false;
        Iterator<String> it = razas.iterator(); //Se instancia el iterador

        System.out.println("Ingrese la raza que desea eliminar ");
        String aux = entrada.next();

        while (it.hasNext()) {

            if (aux.equals(it.next())) {

                it.remove();
                encontrado = true;
                System.out.println("La raza " + aux + " fue eliminada");
            }

        }
        if (!encontrado) {
            System.out.println("La raza no se encuentra");
        }
    }

}
