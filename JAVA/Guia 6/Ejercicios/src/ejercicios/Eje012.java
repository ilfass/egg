/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().

package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      
         boolean salir  = false;
        do {
        System.out.println("Ingrese la cadena de texto maximo 5 caracteres");
        String caracteres = leer.nextLine();
        caracteres = caracteres.toLowerCase();
     
     int tamano = caracteres.length();
        System.out.println(caracteres.substring(0,1));
            System.out.println(caracteres.length());
            System.out.println(caracteres.substring(tamano-1,tamano));
            System.out.println(caracteres.substring(tamano).equals("0"));
            
        if ( caracteres.length() < 6 && caracteres.substring(0,1).equals("x") && caracteres.substring(tamano-1,tamano).equals("0")){
    
            System.out.println("Correcto");
              
        }
   else if(caracteres.substring(0,tamano).equals("&&&&&")){
    salir = true;
    }else{
       
            System.out.println("Incorrecto");   
   }
        
    }
       while (salir==false);
}}
