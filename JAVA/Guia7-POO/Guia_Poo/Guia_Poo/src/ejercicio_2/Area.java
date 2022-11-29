package ejercicio_2;

public class Area {
    
    public void calcularArea(Circunferencia circunferenciaObjeto) {
        circunferenciaObjeto.setArea((float) (Math.PI *Math.pow(circunferenciaObjeto.getRadio(), 2.0))); 
    }
     public void mostrarArea (Circunferencia circunferenciaObjeto){
        System.out.println("El area de la circunferencia es de: " + circunferenciaObjeto.getArea());
    }
}
