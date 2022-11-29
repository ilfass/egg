package ejercicio_6;

public class ServicioCafetera {
    
  public void llenarCafetera(Cafetera cafetera){
      cafetera.setCapacidadMaxima((float) 1.50);
      cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
      System.out.println("La cafetera se ha llenado en su totalidad (" + cafetera.getCapacidadActual()+ ").");
         
  }
    
    
}
