/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fa07f
 */
public class fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
//        Date fechaActual = new Date();
//        System.out.println(fechaActual);
//        SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
//        String fechaFormateada = sdf.format(fechaActual);
//          System.out.println(fechaFormateada);
//        
//        objetoDate fecha = new objetoDate();

Date fechaActual = new Date();
Date fecha2 = new Date();

        System.out.println(fechaActual);
  
        
        
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año");
        int anio = leer.nextInt();


        fecha2.setDate(dia); // Seteamos el dia
        fecha2.setMonth(mes); // Seteamos el mes
        fecha2.setYear(anio); // Seteamos el anio
        
        System.out.println(fecha2);
        
        long diferencia = fecha2.getTime()-fechaActual.getTime();
        
        System.out.println(fecha2.getTime());
        System.out.println(fechaActual.getTime());
        System.out.println(" la diferacia es "+ diferencia);
        
        TimeUnit unidad = TimeUnit.DAYS;
        long dias = unidad.convert(diferencia, TimeUnit.HOURS);
        System.out.println("Los días faltantes son "+ dias);
}
}