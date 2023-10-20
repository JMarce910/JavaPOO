/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class OperacionService {
    
    private Operacion operacion;
    private Scanner scanner;
    
    
    public OperacionService(){
    scanner = new Scanner(System.in);
    operacion = new Operacion();
    
    }
    
    // d. Metodo para crear operacion--pide nums y guarda
    public void crearOperacion(){
        
        System.out.println("Ingrese el primer número: ");
        operacion.setNumero1(scanner.nextDouble());
        
        System.out.println("Ingrese el segundo número: ");
        operacion.setNumero2(scanner.nextDouble());
    }
    
    // e. Metodo sumar
    public double sumar(){
        return operacion.getNumero1() + operacion.getNumero2();
    }
    
    // f. Metodo restar
    public double restar(){
        return operacion.getNumero1() - operacion.getNumero2();
    }
    
    // g. Metodo multiplicar
    public double multiplicar(){
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0){
            System.out.println("ERROR: no se puede multiplicar por cero");
            return 0;
        }
        return operacion.getNumero1() * operacion.getNumero2();
    }
    
    // h. Metodo dividir
    public double dividir(){
        if (operacion.getNumero2() == 0){
            System.out.println("ERROR: no se puede dividir por cero");
            return 0;
        }
        return operacion.getNumero1() / operacion.getNumero2();
    }
    
}
