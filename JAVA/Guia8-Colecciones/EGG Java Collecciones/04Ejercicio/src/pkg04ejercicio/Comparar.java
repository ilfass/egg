package pkg04ejercicio;

import java.util.Comparator;

public class Comparar {

    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getHoras().compareTo(t1.getHoras());
        }
    };
        
    public static Comparator<Pelicula> compararMenorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getHoras().compareTo(t.getHoras());
        }
    };
        
    
    public static Comparator<Pelicula> ordenarPeliculasAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());

        }
    };
    public static Comparator<Pelicula> ordenarPeliculaPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
