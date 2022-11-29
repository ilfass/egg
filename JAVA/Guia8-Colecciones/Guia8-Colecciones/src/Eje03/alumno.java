/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje03;

import java.util.ArrayList;

/**
 *
 * @author fa07f
 */
public class alumno {
    String nombre;
    ArrayList<Integer> notas;

    public alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public alumno() {
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
}
