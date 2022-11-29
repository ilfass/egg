package ejercicio_3;

public class Operaciones {
    
    public float sumar (Operacion numero){
        numero.setSuma(numero.getNumero1()+numero.getNumero2());
        System.out.println("La suma entre " + numero.getNumero1() + " y " + numero.getNumero2()+ " es " + numero.getSuma());
        return numero.getSuma();
    }
    
    public float restar (Operacion numero){
        numero.setResta(numero.getNumero1()-numero.getNumero2());
        System.out.println("La resta entre " + numero.getNumero1() + " y " + numero.getNumero2()+ " es " + numero.getResta());
        return numero.getResta();
    }
   
    public float multiplicar(Operacion numero) {
        
        if(numero.getNumero1() ==0 || numero.getNumero2() ==0){
            numero.setMultiplicacion(0);
            System.out.println("No se permite la multiplicacion por 0.");
        }else{
           numero.setMultiplicacion(numero.getNumero1() * numero.getNumero2()); 
            System.out.println("La multiplicacion entre " + numero.getNumero1() + " y " + numero.getNumero2() + " es " + numero.getMultiplicacion());

        }    
        return numero.getMultiplicacion();
    }
   
    public float dividir(Operacion numero) {
        
        if(numero.getNumero2()==0){
            numero.setDivision(0);
            System.out.println("No se permite la division sobre 0.");
        }else{
          numero.setDivision(numero.getNumero1()/numero.getNumero2()); 
        }    
        System.out.println("La division entre " + numero.getNumero1() + " y " + numero.getNumero2() + " es " + numero.getDivision());
        return numero.getDivision();
    }
    
    
    
}
