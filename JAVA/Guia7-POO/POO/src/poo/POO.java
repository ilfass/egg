/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;
import poo.entidades.Mascota;



/**
 *
 * @author fa07f
 */
public class POO {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
            Mascota m2 = new Mascota();
        Mascota m1 = new Mascota("FAbian Chiquito", "chiquito", "Perro");
   
        
      //  System.out.println(m1.apodo + " "+ m1.edad + " " +m1.tipo);
  
       // m1.nombre = "pepe chiquito"; //cuando tengo los denominadores de accesibilidad en Publico
       
     m1.setNombre("pepe chiuquito");
     
     
     m1.pasear(100);
        System.out.println(m1);

     
    }
    
}
