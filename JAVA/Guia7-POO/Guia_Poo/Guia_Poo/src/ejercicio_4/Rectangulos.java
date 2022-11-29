package ejercicio_4;

public class Rectangulos {

    private float base;
    private float altura; 
    private float superficie;
    private float perimetro;

    public Rectangulos() {
    }

    public Rectangulos(float base, float altura, float superficie, float perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public Rectangulos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
