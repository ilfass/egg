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
public class Persona {
protected String nombre;
protected Integer edad;
protected Integer documento;

    public Persona(String nombre, Integer edad, Integer documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }
    
    public void codear(){
        System.out.println("Un persona comun no codea");
    }
}


class Alumno extends Persona{
    
private String materia;   

@Override
public void codear(){
        System.out.println("Está ");
    }


    public Alumno(String materia, String nombre, Integer edad, Integer documento) {
        super(nombre, edad, documento);
        this.materia = materia;
        
//        super.atributoClasePadre;
//        super.metodoClasePadre;


    }



}
