/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje01.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fa07f
 */



public class serviciosRaza {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList <String> raza;

    public serviciosRaza() {
        this.raza = new ArrayList();
    }
    
    public void anadirRaza(){
    boolean salir= false;
   do{
       System.out.println(" Ingrese una raza de Perrito");
       String tipo = leer.next();
       
       System.out.println(" Desea salir [S] o agregar otra raza[O]");
       String eleccion = leer.next().toLowerCase();
      raza.add(tipo);
       
       if ("s".equals(eleccion) ){
           salir= true;
           System.out.println(" ya vas a salir, hasta luego");
       }
      } 
   while (!salir);    
     }
    
    public void mostrarRaza(){
        for (String aux : raza) {
            System.out.print(aux + " -- ");  
             }
        System.out.println("");
            System.out.println("Agregaste "+ raza.size() + " razas");
       
    }
    
//    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
    public void pediryborrar(){
      System.out.println(" cual es la raza de Perrito que busca");
       String buscarRaza = leer.next();
        boolean busqueda = false;
       Iterator<String> iter = raza.iterator();
        System.out.println("Elementos de la lista: ");
        
while (iter.hasNext()){
     String aux = iter.next();
      if (aux.equalsIgnoreCase(buscarRaza)){
         iter.remove();
       busqueda = true;  
      }
 //Collections.sort(raza);
     }
      if (!busqueda){   
          System.out.println("El perro no taaa");

        }
        Collections.sort(raza);   
    }}
    

