/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

/**
 *
 * @author fa07f
 */
public class biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      libro  libro1 = new libro();
      libroServicio ls = new libroServicio();
      
      ls.crearLibro();
      ls.mostrarlibro(libro1);
    }
    
}
