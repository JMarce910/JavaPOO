/*
 *
 */
package entidad;


/**
 * @author Pc
 */
public class Operacion {
    
    
    //atributos privados
    private double numero1;
    private double numero2;

    
    // a. constructor con atributos pasados por parametros
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // b. constructor vacio
    public Operacion() {
    }
    

    // c. metodos get y set
    public double getNumero1() {
        return numero1;
    }

     public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
    
}
