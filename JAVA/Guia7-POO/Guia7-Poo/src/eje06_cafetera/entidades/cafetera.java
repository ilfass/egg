/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje06_cafetera.entidades;

/**
 *
 * @author fa07f
 */
public class cafetera {
    
    //atributos
    int capacidadMaxima = 100;
    int capacidadActual;
        
    //Constructor vacio
    public cafetera(){};
    
    //contructor con los atributos

    public cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    // Metodos Get y Set

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
    
}
