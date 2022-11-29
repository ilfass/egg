/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje04;

import Eje04.servicios.serviciosPeliculas;
import java.util.ArrayList;


/**
 *
 * @author fa07f
 */
public class mainPliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pelicula pelis = new pelicula();
        serviciosPeliculas servis = new serviciosPeliculas();
        servis.crearPelicula();
      //  ArrayList<pelicula> listaPeliculas = null;
    servis.mostrarTodas(pelis);
    servis.peliculasMayor1Hora();
    }
    
}
