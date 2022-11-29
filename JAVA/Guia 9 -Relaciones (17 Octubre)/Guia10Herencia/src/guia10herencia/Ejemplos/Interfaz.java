/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia.Ejemplos;

/**
 *
 * @author fa07f
 */
public interface Interfaz {
     public final int CONSTANTE =10;
    public void metodo();
    public int sumar();
    
}

class Clase implements Interfaz{

    @Override
    public void metodo(){
        System.out.println("Implementación del metodo");
    }

    @Override
    public int sumar(){
    int suma = 2+2;
    return suma;
    }
    
    
}
