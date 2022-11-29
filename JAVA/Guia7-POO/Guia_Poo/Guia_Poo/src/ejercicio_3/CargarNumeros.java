package ejercicio_3;
import java.util.Scanner;


public class CargarNumeros {
    Scanner read = new Scanner(System.in);
    
    public void ingresoPrimerNumero(Operacion numero ){
    
        System.out.print("\nIngrese el primer número: ");
        numero.setNumero1(read.nextFloat()); 
    }
    
    public void ingresoSegundoNumero(Operacion numero){
        System.out.print("Ingrese el segundo número: ");
        numero.setNumero2(read.nextFloat());
    }
    
}
