/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class condicionesles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opinion;
        Scanner leer =new Scanner(System.in);
        
        
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >=1 && opinion <= 5) {
        
            switch(opinion){
                case 1:
                case 2:
                    System.out.println("Nos setinmos muy apenados");
            break;
                case 3:
                      System.out.println("Has calificado la peli como buena");
                      break;
                case 4:
                      System.out.println("Has calificado la peli como muy buena");
                      break;
                      case 5:
                      System.out.println("fantastico que hayas disfrutado");
                      break;
            }
            
        }else if (opinion < 0){
            System.out.println("tan mala fue?");
        
         }else if (opinion == 0){
            System.out.println("el valor " +opinion +" no se toma en cuenta");
        }else {
         System.out.println("se te fue la mano de dios");
         }
        
        System.out.println("HASTA LA PROXIMA");   
    }
    
}
