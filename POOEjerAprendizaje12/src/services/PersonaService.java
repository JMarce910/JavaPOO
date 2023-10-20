

package services;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;



public class PersonaService {

    private Scanner leer = new Scanner(System.in);
    private Persona persona = new Persona();

    public void crearPersona() {

        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento (1 al 12): ");
        int mes = leer.nextInt()- 1;
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt() - 1900;
        Date nacimiento = new Date(anio, mes, dia);
        persona.setNombre(nombre);
        persona.setFecha(nacimiento);
    }

    public int calcularEdad() {

        Date fechaActual = new Date();
        int edadActual = fechaActual.getYear() - persona.getFecha().getYear();
        if ((fechaActual.getMonth() >= persona.getFecha().getMonth()) && (fechaActual.getDay() < persona.getFecha().getDay())) {    
        //edadActual--;
        }
        return edadActual;
    }

    public void mostrarPersona() {

        System.out.println(" Nombre: " + persona.getNombre() + "\n Fecha de nacimiento: " + persona.getFecha());
    }

    public boolean menorQue(int edad) {

        if (calcularEdad() > edad) {
            System.out.println("es menor");
            return true;
        } else {
            System.out.println("es mayor ");
            return false;
        }

    }
}
