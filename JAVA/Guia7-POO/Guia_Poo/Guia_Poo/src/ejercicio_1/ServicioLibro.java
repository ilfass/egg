package ejercicio_1;
import java.util.Scanner;

public class ServicioLibro {

    Scanner read= new Scanner (System.in);
    //Método cargar libro 
    
    public void cargarLibro (Libro libroObjeto){
        System.out.print("Ingrese el número de ISBN del libro: ");    
        libroObjeto.setISBN(read.nextInt());
        
        read.nextLine(); 
        
        System.out.print("Ingrese el titulo del libro: ");
        libroObjeto.setTitulo(read.nextLine());
        
        System.out.print("Ingrese el autor del libro: ");
        libroObjeto.setAutor(read.nextLine());
        
        System.out.print("Ingrese la cantidad de paginas: ");
        libroObjeto.setNumeroDePaginas(read.nextInt());
    
    }

    public void informeLibro (Libro libroObjeto){
        System.out.println("El número de ISBN del libro es: " + libroObjeto.getISBN());
        System.out.println("El titulo del libro es: " + libroObjeto.getTitulo());    
        System.out.println("El autor del libro es: " + libroObjeto.getAutor());
        System.out.println("La cantidad de paginas del libro es: " + libroObjeto.getNumeroDePaginas());
    }
    
    
}
