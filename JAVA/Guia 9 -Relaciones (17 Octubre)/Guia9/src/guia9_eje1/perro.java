/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_eje1;

/**
 *
 * @author fa07f
 */
public class perro {
    private String raza;
   private int edad;
    private String tamano;

    public perro() {
    }

    public perro(String raza, int edad, String tamano) {
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
}
