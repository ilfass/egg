
package ejercicios_4;
import java.util.Scanner;

public class ServicioNIF {
    Scanner input = new Scanner (System.in).useDelimiter("\n");
    char [] charNIF = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public NIF crearNif(){
        long DNI=0;
        
        
        
        do{
            System.out.println("Ingrese su dni: ");
            DNI= input.nextLong();
        }while(Long.toString(DNI).length() !=8 && Long.toString(DNI).length() !=7);
        
        char letra = charNIF[(int)DNI %23];
        
        return new NIF (DNI,letra) ; 
    }
    
    
    public void mostrarNIF (NIF nif){
        System.out.println("El número de NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }
    
}
