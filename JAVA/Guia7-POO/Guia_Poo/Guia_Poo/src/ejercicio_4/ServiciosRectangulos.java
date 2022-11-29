package ejercicio_4;
import java.util.Scanner;
public class ServiciosRectangulos {
    Scanner read = new Scanner (System.in); 
    
    public void ingresarBase (Rectangulos rectanguloObjeto){
        System.out.print("Ingrese la base del rectangulo: ");
        rectanguloObjeto.setBase(read.nextFloat());
    }
    
    public void ingresarAltura (Rectangulos rectanguloObjeto){
        System.out.print("Ingrese la altura del rectangulo: ");
        rectanguloObjeto.setAltura(read.nextFloat());
    }
    
    public void calcularSuperficieRectangulo (Rectangulos rectanguloObjeto){
        rectanguloObjeto.setSuperficie(rectanguloObjeto.getBase() * rectanguloObjeto.getAltura());
        System.out.println("La superficie del rectangulo es: " + rectanguloObjeto.getSuperficie());
    }
    
    public void calcularPerimetroRectangulo(Rectangulos rectanguloObjeto) {
        rectanguloObjeto.setPerimetro((rectanguloObjeto.getBase() + rectanguloObjeto.getAltura())*2);
        System.out.println("El perimetro del rectangulo es: " + rectanguloObjeto.getPerimetro());
    }
    
    public void dibujarRectangulo(Rectangulos rectanguloObjeto) {
       
        for (int i = 0; i < rectanguloObjeto.getBase(); i++) {
            for (int j = 0; j < rectanguloObjeto.getAltura(); j++) {
                
                if( (i==0) || (i==rectanguloObjeto.getBase() -1 ) || (j==0) || (j==rectanguloObjeto.getAltura()-1)){
                  System.out.print(" * ");  
                }    
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
            
        }
        
        
    }
    
    
}
