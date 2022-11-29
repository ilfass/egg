//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
package pkg01ejercicio;

import java.util.ArrayList;

public class Perro {

    String razas, nombre;

    public Perro() {
    }

    public Perro(String razas, String nombre) {
        this.razas = razas;
        this.nombre = nombre;
    }

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
