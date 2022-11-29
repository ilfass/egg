/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje03;

import Eje03.servicios.servicios;

/**
 *
 * @author fa07f
 */
public class todosAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servicios serAlum = new servicios();
        alumno toditosAlumnos = new alumno();
        serAlum.crearAlumno();
        serAlum.mostrarAlumnos(toditosAlumnos);
        serAlum.econtrarAlumno();
       
        
    }
    
}
