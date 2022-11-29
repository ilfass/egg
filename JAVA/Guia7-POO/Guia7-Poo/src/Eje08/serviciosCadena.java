/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje08;

/**
 *
 * @author fa07f
 */
public class serviciosCadena {
    
    public void mostrarVocales(cadena textos){
      String letras = textos.getFrase();
      int cont=0;
        for (int i = 0; i < textos.getLongitud(); i++) {
            if(letras.charAt(i) == 'a' ||letras.charAt(i) == 'e'||letras.charAt(i) == 'i'||letras.charAt(i) == 'o'||letras.charAt(i) == 'u' ){
            cont ++;
            }   
        }
        System.out.println("La cantidad de vocales es: "+cont);
      
    }
    public void invertirFrase(cadena textos){
    //char[] letras = new char [textos.getLongitud()];
    String invertido ="";
      for (int i = textos.getLongitud()-1; i >= 0; i--){
          char actual = textos.getFrase().charAt(i);
          
          invertido = invertido +actual;
                }
       System.out.println("La frase invertida es "+ invertido);
    }
    
    public void vecesRepetido(char letra, cadena textos){
        int cont=0;
        for (int i = 0; i < textos.getLongitud(); i++) {
    
            if(textos.getFrase().charAt(i) == letra){
            cont ++;
            }   
        }
        System.out.println("Se repite: "+cont);
}

public void compararLongitud(String nuevaFrase, cadena textos){

    if(nuevaFrase.length()>textos.getLongitud()){
        System.out.println(" La longitud de la nueva frase es mayor con "+nuevaFrase.length()+" caracteres");
    }else
        System.out.println(" La longitud de la frase original es mayor con "+textos.getLongitud()+" caracteres");
}
public void unirFrases(String nuevafrase, cadena textos){
    System.out.println(nuevafrase +" "+ textos.getFrase());
    System.out.println("LA nueva frase es "+ nuevafrase);
}
public void reemplazar(String letra, cadena textos){
String remplazo = textos.getFrase().replace("a", letra);
            
    System.out.println(" la frase reemplazada es: "+remplazo);
            }
            
public void contiene(String letra, cadena textos){
boolean contiene= false;
    System.out.println("ver si contine"+ letra);
      for (int i = 0; i < textos.getLongitud(); i++) {
if (textos.getFrase().substring(i).equals(letra)){
contiene = true;
}
    

}
      System.out.println(" es "+ contiene);
}



}