

package pooejeraprendizaje11;

import java.util.Date;
import java.util.Scanner;


public class POOEjerAprendizaje11 {

    /**
     * @param args the command line arguments
     * 
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar 
     * solo con la clase Date. En este ejercicio deberemos instanciar en el 
     * main, una fecha usando la clase Date, para esto vamos a tener que crear 
     * 3 variables, dia, mes y anio que se le pedirán al usuario para poner el 
     * constructor del objeto Date. 
     * Una vez creada la fecha de tipo Date, 
     * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la 
     * fecha actual, que se puede conseguir instanciando un objeto Date con 
     * constructor vacío. Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
     * Ejemplo fecha actual: Date fechaActual = new Date(); 
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos al usuario el día, mes y año para crear la fecha
        /**System.out.print("Introduce el dia: ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt() - 1; 
        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();
        

        Date fecha = new Date(anio - 1900, mes, dia); 
        System.out.println("Fecha introducida: " + fecha);
        Date fechaActual = new Date();
        int diferenciaAnios = fechaActual.getYear() - fecha.getYear();

        System.out.println("Diferencia de años entre la fecha introducida y la actual: " + diferenciaAnios);
        **/
        
        System.out.println("Digita el dia");
        int dia = scanner.nextInt();
        System.out.println("Digita el mes");
        int mes = scanner.nextInt();
        System.out.println("Digita el año");
        int año = scanner.nextInt();
        Date miFecha = new Date(año - 1900, mes, dia);
        Date date = new Date();
        int getYears1 = date.getYear();
        int getYears2 = miFecha.getYear();
        int operacion = getYears1 - getYears2;
        if (operacion < 0) {
            System.out.println("El tiempo de diferencia entre años es: " + operacion * - 1 + " Años Mas");
        } else {
            System.out.println("El tiempo de diferencia entre años es: " + operacion + " Años Menos");
        }
    }
    
}
