/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pc
 */
public class Persona {
    
    public String nombre;
    public int edad;
    public int id;

    //constructor vacio
    public Persona() {
    }

    
    //constructor con parámetros
    public Persona(String nombre, int edad, int id) {
        this.nombre = nombre;  //this.nombre hace referencia a la clase
        this.edad = edad;
        this.id = id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    
    
    
    
    
}
