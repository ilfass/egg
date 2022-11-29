package ejercicio_2;


public class Perimetro {
        public void calcularPerimetro(Circunferencia circunferenciaObjeto) {
        
        circunferenciaObjeto.setPerimetro((float) (2 * Math.PI *(circunferenciaObjeto.getRadio())));
    }
        
        public void mostrarPerimetro (Circunferencia circunferenciaObjeto){
            System.out.println("El perimetro de la circunferencia es de : " + circunferenciaObjeto.getPerimetro());
        }
        
}
