/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje06_cafetera;

import eje06_cafetera.entidades.cafetera;
import eje06_cafetera.entidades.servicios;
import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class eje06_cafetera {
   
    /**
     * @param args the command line arguments
     * 
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese el tamaño de la taza");
        int tamanioTaza = leer.nextInt();
        
        cafetera nespresso = new cafetera();
        servicios servi = new servicios();
        servi.llenarCafetera(nespresso);
        servi.servirTaza(tamanioTaza, nespresso);
        servi.vaciarCafetera(nespresso);
   
          System.out.println("Agregar cantidad de cafe");
        int agregadoCafe = leer.nextInt();
        
        servi.agregarCafe(nespresso, agregadoCafe);
        
    }
    
}
