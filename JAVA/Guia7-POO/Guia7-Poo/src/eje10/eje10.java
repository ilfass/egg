/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje10;

import java.util.Arrays;

/**
 *
 * @author fa07f
 */
public class eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double arregloA[] = new double[50];
        double arregloB[] = new double[20];

        llenarArreglo(arregloA, arregloB);
        ordenarycopiar(arregloA, arregloB);
    }

    public static void llenarArreglo(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random()*25+1;
            System.out.print("|" + arregloA[i] + "|");
        }
    }

    public static void ordenarycopiar(double[] arregloA, double[] arregloB) {
        Arrays.sort(arregloA);
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }
        }
        System.out.println("arreglo A" + Arrays.toString(arregloA));
        System.out.println("arreglo B" + Arrays.toString(arregloB));
    }
}

