/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje08;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class eje08main {

    /**
     * @param args the command line arguments
     */
    //Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cadena laFrase = new cadena();
        System.out.println(" Ingrese una palabra o varias");
        String laPalabra = leer.nextLine();
        // laFrase.setFrase(leer.next());
        laFrase.setFrase(laPalabra);
        laFrase.setLongitud(laPalabra.length());

        serviciosCadena servi = new serviciosCadena();
        servi.mostrarVocales(laFrase);
        servi.invertirFrase(laFrase);

        System.out.println(" Ingrese un caracter");
        char caracter = leer.next().charAt(0);
        servi.vecesRepetido(caracter, laFrase);
        System.out.println("El caracter es "+ caracter);
 //leer.next();
        System.out.println(" Ingrese una nueva frase");
        String nuevafrase = leer.next();
         System.out.println("laaaaaaaa nuevaaaa frase es "+nuevafrase);
        
        servi.compararLongitud(nuevafrase, laFrase);
        System.out.println(" Ingrese un caracterrr");
        String ultimoCaracter = leer.nextLine();
leer.next();
        servi.unirFrases(nuevafrase, laFrase);
        servi.reemplazar(ultimoCaracter, laFrase);
        servi.contiene(ultimoCaracter, laFrase);
    }

}
