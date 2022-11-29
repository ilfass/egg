//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
package pkg03ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicio {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> alumnos = new ArrayList();

    public void crearAlumno() {
        String opcion;
        boolean salir;
        do {
            Alumno alumno = new Alumno();

            List<Integer> notes = new ArrayList();
            System.out.println("Ingrese nombre del alumno");
            alumno.setNombre(entrada.next());
            notes.add(((int) (Math.random() * 10) + 1));
            notes.add(((int) (Math.random() * 10) + 1));
            notes.add(((int) (Math.random() * 10) + 1));

            alumno.setNotas(notes);
            alumnos.add(alumno);
            System.out.println("Las notas son: " + alumno.getNotas());
            System.out.println("Desea crear otro alumno? Si/No");
            opcion = entrada.next();

        } while (opcion.equalsIgnoreCase("si"));

    }
    //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

    public double notaFinal() {

        System.out.println("Ingrese el nombre del alumno para ver el promedio");
        String buscar = entrada.next();
        double promedio = 0;

        for (Alumno aux : alumnos) {

            if (buscar.equals(aux.getNombre())) {
                int total = 0;
                for (Integer nota : aux.getNotas()) {
                    total += nota;

                }
                promedio =(double) total / aux.getNotas().size();

            }
        }
        return promedio;
    }

}
