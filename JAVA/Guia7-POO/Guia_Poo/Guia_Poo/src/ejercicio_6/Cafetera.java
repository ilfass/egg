package ejercicio_6;

public class Cafetera {
    
    private float capacidadMaxima;
    private float capacidadActual;

    
    // Constructor vacío
    public Cafetera() {
    }
    
    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(float capacidadMaxima, float capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    // Métodos getters y setters.

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public float getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(float capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
    
    
}
