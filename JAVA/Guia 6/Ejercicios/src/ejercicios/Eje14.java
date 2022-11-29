/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double cantEuros = leer.nextFloat();
          leer.nextLine();
           System.out.println("Ingrese la moneda  a convertir Dolares, Yenes O Libras");
           String monedaConvertir = leer.nextLine();
           
            System.out.println("La cant a convertir es " +monedaConvertir);
          
           moneda(cantEuros,monedaConvertir);
    }
    
    public static void  moneda(double cantEuros,String monedaConvertir) {
        System.out.println("La cant a convertir es " +monedaConvertir);
if (monedaConvertir.equalsIgnoreCase("dolares")){
    double conversion = cantEuros * 0.86;
     System.out.println(conversion);
} else if (monedaConvertir.equalsIgnoreCase("yenes")){
double conversion = cantEuros * 1.28611;
 System.out.println(conversion);
}else if (monedaConvertir.equalsIgnoreCase("Libras")){
double conversion = cantEuros * 129.852;
 System.out.println(conversion);
}else {
    System.out.println("Esa moneda, no existe");
}
    }
}

//switch(monedaConvertir){
//    case "yenes":
//        
//        break;
//
//
//}
//    }
//}