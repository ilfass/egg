package ejercicio_2;

public class Circunferencia {
    private float radio;
    private float area;
    private float perimetro;
    
    //Constructor vacio
    public Circunferencia(){
        
    }

    public Circunferencia(float radio, float area, float perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    //Constructor con parametro
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }    
}
