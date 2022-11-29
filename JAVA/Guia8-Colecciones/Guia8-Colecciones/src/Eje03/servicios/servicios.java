/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje03.servicios;

import Eje03.alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class servicios {

    ArrayList<alumno> listaAlumnos;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public servicios() {
        this.listaAlumnos = new ArrayList<alumno>();
    }

    public void crearAlumno() {

        boolean seguir = true;
        while (seguir) {
            ArrayList<Integer> tresNotas = new ArrayList<Integer>();
            System.out.println("Cual es el nombre del Alumno ");
            String nombre = leer.next();
            System.out.println("Ingrese las tres notas");
            Integer nota1 = leer.nextInt();
            Integer nota2 = leer.nextInt();
            Integer nota3 = leer.nextInt();
            tresNotas.add(nota1);
            tresNotas.add(nota2);
            tresNotas.add(nota3);
            listaAlumnos.add(new alumno(nombre, tresNotas));
            System.out.println("Quiere agregar otro alumno (S) (N)");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("n")) {
                seguir = false;
            }
        }
    }

    public void mostrarAlumnos(alumno alumnazo) {

        listaAlumnos.forEach((aux) -> {
          System.out.println(aux);
//        });

         //   System.out.println(alumnazo.getNombre() + alumnazo.getNotas());
        });
        System.out.println("cantidad de alumnos " + listaAlumnos.size());
    }

    public alumno econtrarAlumno() {
       boolean pos =false;
        alumno encontrado = new alumno();
        System.out.println("Cual es el nombre del Alumno que quiere calcular su nota ");
        String alumnoPromediar = leer.next();
        for (int i = 0; i < listaAlumnos.size(); i++) {
 
            if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(alumnoPromediar))
            {
                encontrado = listaAlumnos.get(i);
                notaFinal(encontrado);
                System.out.println("Entro al if y es "+ encontrado);
                pos=true;
            }}
            if(pos == false){
                System.out.println("El alumno no esta");
            }

            // double promedio =  listaAlumnos.get(i).getNotas().iterator();
            //  Iterator iterator =listaAlumnos.getgetNombre().getNotas().iterator();
//      while (iterator.hasNext()){
//          System.out.println(iterator.next()+"");
//      }
//      existe = listaAlumnos.contains(alumnoPromediar);
//		if (existe) {
//			System.out.println("El elemento SÍ existe en la lista");
//		} else {
//			System.out.println("El elemento no existe");
//		}
        
        return encontrado;
    }

    public void notaFinal(alumno encontrado) {

         int sum = encontrado.getNotas().stream().mapToInt(Integer::intValue).sum();
        System.out.println("El promedio es: " + sum);        // 15
    }
}
