/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Persona {
    
    private String nombre;
    private Date date;
    public Persona(){

    }
    public Persona(String nombre, Date date) {
        this.nombre = nombre;
        this.date = date;
    }
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        this.nombre = leer.next();
        System.out.println("Introduce tu fecha de nacimiento");
        System.out.println("Año: ");
        int año = leer.nextInt();
        System.out.println("Mes:");
        int mes = leer.nextInt();
        System.out.println("Dia:");
        int dia = leer.nextInt();
        this.date = new Date(año - 1900, mes - 1, dia);
    }
    public void calcularEdad(){
        Date dateActual = new Date();
        int thisYear = dateActual.getYear();
        int bornYear = this.date.getYear();
        int operacion = thisYear - bornYear;
        System.out.println("Tienes " + operacion + " Años");
    }
    public void menorQue(){
        Date dateActual = new Date();
        int thisYear = dateActual.getYear();
        int bornYear = this.date.getYear();
        int operacion = thisYear - bornYear;
        if(operacion < 18){
            System.out.println("Eres menor de edad");
        }else {
            System.out.println("Eres mayor de edad");
        }
    }
    public String mostrarPersona(){
       return "Nombre: " + this.nombre +" Fecha de Nacimiento: "+  this.date;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
