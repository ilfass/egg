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
abstract class PersonaAbstracta {
    public abstract void codear();
}

class Alumnos extends PersonaAbstracta{
@Override
public void codear(){
    System.out.println("Esta Aprendiendo");
}
}