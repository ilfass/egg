//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
package pkg04ejercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Servicio {

    List<Pelicula> peliculas = new ArrayList();
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {

        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        peli.setTitulo(entrada.next());
        System.out.println("Ingrese el director");
        peli.setDirector(entrada.next());
        System.out.println("Ingrese la duracion de la pelicula");
        peli.setHoras(entrada.nextDouble());

        return peli;
    }

    //En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
    public void cargarPeliculas() {
        String salir;

        do {
            peliculas.add(crearPelicula());
            System.out.println("Desea seguir agregarndo peliculas?");
            salir = entrada.next();

        } while (salir.equals("si"));

    }

    public void mostrarPeliculas() {
        System.out.println("Las peliculas son: ");
        for (Pelicula pelicula : peliculas) {

            System.out.println(pelicula);

        }

    }

    public void peliculasLargas() {
        System.out.println("Las peliculas con duracion de mas de una hora");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getHoras() > 1) {
                System.out.println(pelicula);
            }

        }

    }

    public void ordenarPeliculasMayorAMenor() {

        List<Pelicula> copia = new ArrayList<Pelicula>(this.peliculas);
        
        copia.sort(Comparator.comparingDouble(peli->peli.getHoras())); // comparar de tipos primitivos
        
        //copia.forEach(peli->this.mostrarUnaPelicula(peli));
        copia.forEach(peli->System.out.println(peli));
        
           
        
    }
    
    
    public void ordenarPeliculasMenorAMayor(){
        
         List<Pelicula> copia = new ArrayList<Pelicula>(this.peliculas);
         
         Collections.sort(copia, Comparar.compararMenorDuracion);
         for (Pelicula pelicula : copia) {
             System.out.println(pelicula);
        }
    }
//    private void mostrarUnaPelicula(Pelicula peli){
//        
//        System.out.println(peli.getTitulo());
//        System.out.println(peli.getDirector());
//        System.out.println(peli.getHoras());
//        
//    }
    
    public void ordenarAlfabeticamente(){
        
        List<Pelicula> copia = new ArrayList<Pelicula>(this.peliculas);
        
        Collections.sort(copia, Comparar.ordenarPeliculasAlfabeticamente);

        for (Pelicula pelicula : copia) {
            System.out.println(pelicula);
            
        }
        
  
        
    }
          public void ordenarAlfabeticamentePorDirector(){
            
            List<Pelicula> copia = new ArrayList<Pelicula>(this.peliculas);
            
            Collections.sort(copia, Comparar.ordenarPeliculaPorDirector);
            
              for (Pelicula pelicula : copia) {
                  System.out.println(pelicula);
              }
            
        }
}
