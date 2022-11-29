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
public class servicios {
    
    public void llenarCafetera(cafetera objCapActual){
    objCapActual.setCapacidadActual(objCapActual.getCapacidadMaxima() );
    
        System.out.println("la capacidad actual es "+ objCapActual.capacidadActual);
    }

//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
public void servirTaza(int tamanioTaza, cafetera objetoTamact){
    if (objetoTamact.getCapacidadActual()< tamanioTaza){
        System.out.println("No alcanza, Se le sirvio "+ objetoTamact.capacidadActual + " resta servir "+ (tamanioTaza - objetoTamact.getCapacidadActual() ));
    }else{
            System.out.println("Se le sirvio "+ tamanioTaza + " en la cafetera queda "+ (objetoTamact.getCapacidadActual() - tamanioTaza ));

    }
}
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
public void vaciarCafetera(cafetera objetoTamact){
objetoTamact.capacidadActual = 0;
}


//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
public void agregarCafe(cafetera objetoTamact,int agregadoCafe){
    if (agregadoCafe < objetoTamact.getCapacidadMaxima()){
  
    objetoTamact.setCapacidadActual(objetoTamact.getCapacidadActual() + agregadoCafe);
        System.out.println("la cafetera ahora posee "+ objetoTamact.getCapacidadActual());
             
    }else{
        System.out.println("Le quiere agregar mas que la capacidad de la cafetera");
    } 
}

}
