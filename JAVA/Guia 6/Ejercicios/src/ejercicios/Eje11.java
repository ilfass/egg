/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
          System.out.println("ingrese un numero");
   int num1 = leer.nextInt();
            System.out.println("ingrese otro numero");
    int num2 = leer.nextInt();
    leer.nextLine();
    boolean salir = false;
        while (!salir){
        System.out.println("MENÙ");
         System.out.println("1. Sumar");
          System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
             System.out.println("5. Salir");
              System.out.println("Elija una opción Numerica");
    int opcion = leer.nextInt();   
        switch (opcion){
        case 1:
        System.out.println("la suma es " + (num1 + num2));
        break;
           case 2:
        System.out.println("la resta es " + (num1 - num2));
        break;
           case 3:
        System.out.println("la multiplicación es " + (num1 * num2));
        break;
           case 4:
        System.out.println("la división es" + num1 / num2);
        break;
        
           case 5:
        System.out.println("Esta seguro que desea salir S/N");
         leer.nextLine();
      String eleccion = leer.nextLine();
        System.out.println("SAliste perro primo");
       eleccion = eleccion.toUpperCase();
if (eleccion.equals("S")){
       salir=true;
           break;
           
      }else{
        salir=false;
      }
        
           
            default:
        System.out.println("Ingreso una opciòn incorrecta");
       
    }
    }
    }
}
