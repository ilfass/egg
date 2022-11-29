/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
package Eje01;

import Eje01.servicios.serviciosRaza;
import java.util.ArrayList;

/**
 *
 * @author fa07f
 */
public class razaDePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     serviciosRaza servRaza = new serviciosRaza();
 
     servRaza.anadirRaza();
     servRaza.mostrarRaza();
     servRaza.pediryborrar();
     servRaza.mostrarRaza();
    }
    
}
