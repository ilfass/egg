/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje04.servicios;

import Eje04.pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fa07f
 */

public class serviciosPeliculas {

 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
  ArrayList<pelicula>listaPeliculas = new ArrayList<>();  
 
    pelicula nuevaPeli = new pelicula();
  public void crearPelicula(){

boolean salir = false;
    while(!salir){
        //crear objeto
       
//crear pelicula
System.out.println("Cual es el titulo de la pelicula");
//nuevaPeli.setTitulo(leer.nextLine());
String elTitulo=leer.next();
System.out.println("Cual es el director de la pelicula");
//nuevaPeli.setDirector(leer.nextLine());
String elDirector=leer.next();
System.out.println("Cual es la duración de la pelicula");
//String fechaComoTexto = leer.nextLine();
//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//Date fecha = sdf.parse(fechaComoTexto);
//nuevaPeli.setDuracion(leer.nextByte());
int laDuracion = leer.nextByte();
listaPeliculas.add(new pelicula(elTitulo,elDirector,laDuracion));

//pregunta

System.out.println("Quieres agregar otra pelicula (S)  (N)");
String opcion= leer.next();

        System.out.println("La eleción fue "+ opcion);
if (opcion.equalsIgnoreCase("n")){
salir = true;
    System.out.println("Chauuu");
}
} 
    }
 
 
 public void mostrarTodas(pelicula pelis){ 
     for (pelicula aux : listaPeliculas) {
         System.out.println(aux);
     }
}
 
 public void peliculasMayor1Hora(){
     
     System.out.println("---------------------------------");
     
     for (int i = 0; i <listaPeliculas.size() ; i++) {
        if (nuevaPeli.getDuracion() < 2){  
            System.out.println("Entro "+ i+1 + " pelicula mayor");
        System.out.println(listaPeliculas.get(i));
         }
          }
         }
    
}
