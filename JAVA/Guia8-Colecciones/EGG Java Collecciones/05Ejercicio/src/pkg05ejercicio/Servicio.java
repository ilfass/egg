//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
package pkg05ejercicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicio {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paises = new HashSet<>();

    public Pais crearPais() {

        Pais pais = new Pais();

        System.out.println("Ingrese el nombre de un pais");
        pais.setPais(entrada.next());

        return pais;
    }

    public void agregarPais() {

        String salir;

        do {

            paises.add(crearPais());
            System.out.println("¿Quiere agregar otro  pais?");
            salir = entrada.next();

        } while (salir.equalsIgnoreCase("Si"));

    }
    //Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

    public void borrarPais() {
        Set<Pais> copia = new HashSet(this.paises);

        System.out.println("Ingrese el pais que desea eliminar de la lista");
        String aux = entrada.next();
        Iterator<Pais> it = copia.iterator();
        while (it.hasNext()) {
            Pais pa = (Pais) it.next();

            if (pa.getPais().equals(aux)) {
                copia.remove(pa);
                System.out.println("Los paises restantes son: ");
                for (Pais paise : copia) {
                    System.out.println(paise);
                }
            } else {
                System.out.println("El pais no se encuentra en la lista");
            }

        }
    }

}
