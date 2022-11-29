package ejercicio_2;

import java.util.Scanner;

public class CrearCircunferencia {

    Scanner read = new Scanner(System.in);

    public void crearCircunferencia(Circunferencia circunferenciaObjeto) {

        System.out.print("Ingrese el radio de la circunferencia: ");
        circunferenciaObjeto.setRadio(read.nextFloat());
        
    }
    
    
    
}
