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
public class persona {
   private String nombre;
   private int edadper;
    private int dni;
   private perro perrito;

    public persona() {
    }

    public persona(String nombre, int edadper, int dni, perro perrito) {
        this.nombre = nombre;
        this.edadper = edadper;
        this.dni = dni;
        this.perrito = perrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadper() {
        return edadper;
    }

    public void setEdadper(int edadper) {
        this.edadper = edadper;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public perro getPerrito() {
        return perrito;
    }

    public void setPerrito(perro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edadper=" + edadper + ", dni=" + dni + ", perrito=" + perrito.getRaza() + '}';
    }


  
}
