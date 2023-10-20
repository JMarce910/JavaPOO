/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Circunferencia {
    
    private Scanner leer = new Scanner(System.in);
    
    private double radio;
    
    // constructores
    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // metodos get y set
    public double getRadio() {
        return radio;
    }

    
    public void setRadio(double radio) {
        this.radio = radio;
    }    
    
}
