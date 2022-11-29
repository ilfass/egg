/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Braca
 */

    public class Alumno {
    
    String nombre;
     List<Integer> notas;
   

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

  
    
    
}
