/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n= 25;
        int[] vector = new int[n];
        
        for (int i = 0; i < n-1; i++) {
            vector[i] = (int) (Math.random() * 50 + 1);
             
             
             System.out.print(vector[i] + " ");
        }
    Scanner leer = new Scanner(System.in);
     System.out.println( " ");
    System.out.println("Ingrese el valor que quiere buscar");
    int valorABuscar = leer.nextInt();
    int encontrado = 0;
    for (int i = 0; i < n-1; i++) {
        
        if (valorABuscar == vector[i]){
            System.out.println("el valor esta en la posición " + i);
           encontrado++;
           
           if (encontrado>1){System.out.println("Se repite");}
        }
    }




// buscar(vector[],n);
    }
    

//
//public static void buscar (int vector[],int n){
//    Scanner leer = new Scanner(System.in);
//    System.out.println("Ingrese el valor que quiere buscar");
//    int valorABuscar = leer.nextInt();
//    
//    for (int i = 0; i < n-1; i++) {
//        
//        if (valorABuscar == vector[i]){
//            System.out.println("el valor esta en la posición " + i);
//        }
//    }
//}


}