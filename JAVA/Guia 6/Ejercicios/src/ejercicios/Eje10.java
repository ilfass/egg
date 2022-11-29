/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Igrese el nummerero limiti");
   int numlimite = leer.nextInt();
   
   while  (numlimite < 0){
        System.out.println("El numero limite debe ser mayor a Cero");
   int nuevolimite = leer.nextInt();
   numlimite = nuevolimite;
   }
   
      int variosNum= 0;
       while (variosNum < numlimite){
    System.out.println("Ingrese otro numero todavia no lo supero");
   int nuevoNum = leer.nextInt();
   variosNum = (variosNum + nuevoNum);
       }
    }
    }
   
    

