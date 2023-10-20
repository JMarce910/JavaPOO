/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Pc
 * 
 *  Metodo crearPersona(): el método crear persona, le pide los valores de 
 * los atributos al usuario y después se le asignan a sus respectivos atributos 
 * para llenar el objeto Persona. Además, comprueba que el sexo introducido 
 * sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje 
 * 
 *  Método calcularIMC(): calculara si la persona está en su peso ideal 
 * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
 * menor que 20, significa que la persona está por debajo de su peso ideal y
 * la función devuelve un -1. Si la fórmula da por resultado un número entre 
 * 20 y 25 (incluidos), significa que la persona está en su peso ideal y la 
 * función devuelve un 0. Finalmente, si el resultado de la fórmula es un 
 * valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1. 
 * 
 *  Método esMayorDeEdad(): indica si la persona es mayor de edad. 
 * La función devuelve un booleano. 
 */
public class PersonaService {
    
    private Scanner leer = new Scanner(System.in);
    private Persona persona = new Persona();
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        String sexo;
        
        System.out.println("Ingrese el nombre del paciente:");
        String nombre =leer.nextLine();
        //persona.setNombre(leer.nextLine());
        
        System.out.println("Edad: ");
        int edad =leer.nextInt();
        //persona.setEdad(leer.nextInt());
        leer.nextLine();
        
        do {
            System.out.println("Sexo: \nH (hombre) \nM (mujer) \nO (Otro)");
            sexo=leer.nextLine();
            if( !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O") ) {
                System.out.println("respuesta inválida, intente de nuevo ");    
            }
        }while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        
        System.out.println("Peso en Kg: ");
        double peso = leer.nextDouble();
        //persona.setPeso(leer.nextDouble());
        
        System.out.println("Altura en m: ");
        double altura = leer.nextDouble();
        //persona.setAltura(leer.nextDouble());
        
        leer.nextLine();
        System.out.println("");
        System.out.println("");
       

    return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public int calcularIMC(Persona persona){
        
        double imc = persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if (imc<20) {
            return -1;
        }else if(imc>=20 && imc<=25){
            return 0; 
        }else{
            return 1;}
        
    }
    
    public boolean esMayorDeEdad(Persona persona){
        boolean mayor=false;
        if(persona.getEdad()>=18){mayor=true;}
        return mayor;
        
    }

    
    
}
