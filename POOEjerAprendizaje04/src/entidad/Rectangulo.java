/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Pc
 */
public class Rectangulo {
    
    // ATRIBUTOS
    private double altura;
    private double base;
    

    // CONSTRUCTOR VACIO
    public Rectangulo() {
    }

    // CONSTRUCTOR CON PARAMETROS
    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    

    // METODOS GET Y SET
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
   
   
    
}
