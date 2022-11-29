
package guia7ejercicio5;

import Servicios.Cuenta;
import Servicios.Servicio;
import java.util.Scanner;

public class Guia7Ejercicio5 {

 
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Cuenta A1 = new Cuenta();
     Servicio A2 = new Servicio();
     
     A2.crearCuenta(A1);
     A2.ingresarDinero(A1);
     A2.retirarDinero(A1);
     A2.consultarSaldo(A1);
     A2.consultarDatos(A1);
     A2.extraccionRapida(A1);
             
     
     
 
    }
    
}
