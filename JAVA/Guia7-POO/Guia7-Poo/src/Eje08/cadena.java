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
public class cadena {
  private String frase;
  private int longitud;

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

         public cadena() {
    }
   

 
}
