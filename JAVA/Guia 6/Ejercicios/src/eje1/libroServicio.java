/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;


import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class libroServicio {
    
    
    public void  crearLibro(){
        libro l1 = new libro();
  Scanner leer = new Scanner(System.in);
    System.out.println("ingrese ISBN del libro");
   l1.setIsbn(leer.nextInt());
  System.out.println("ingrese Titulo del libro");
   l1.setTitulo(leer.nextLine());
   leer.nextLine(); 
    System.out.println("ingrese Autor del libro");
   l1.setAutor(leer.nextLine());
    System.out.println("ingrese el numero de paginas");
   l1.setNumeroPaginas(leer.nextInt());   
}
    
    public void mostrarlibro (libro l1){
    
        System.out.println("el ISBN del libro es "+ l1.getIsbn() +" Y el titulo " + l1.getTitulo() + " El autor " +l1.getAutor()  + " Y tiene " +l1.getNumeroPaginas() + " paginas");
    }
    

}