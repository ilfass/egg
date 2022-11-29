package ejercicio_3;

public class Operacion {
    
    // Atributos privados numero1 y numero2
    private float numero1;
    private float numero2;
    private float suma;
    private float resta; 
    private float multiplicacion;
    private float division;

    // Método constructor con todos los atributos pasados por parámetro.
    
    public Operacion(float numero1, float numero2, float suma, float resta, float multiplicacion, float division) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }
       
    // Método constructor sin los atributos pasados por parámetro.
    
    public Operacion() {
    }
    
    // Métodos get y set.

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public float getResta() {
        return resta;
    }

    public void setResta(float resta) {
        this.resta = resta;
    }

    public float getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(float multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public float getDivision() {
        return division;
    }

    public void setDivision(float division) {
        this.division = division;
    }
       
}
