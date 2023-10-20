

package entidad;


public class Figura {
    
    private int base;
    private int altura;
    private double radio;

    public Figura() {
    }

    public Figura(int base, int altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
