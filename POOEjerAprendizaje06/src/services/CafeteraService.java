/*
 */
package services;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Pc
 * 
 * * Programa Nespresso. Desarrolle una clase Cafetera con los atributos 
 * capacidadMaxima(la cantidad máxima de café que puede contener la cafetera) 
 * y cantidadActual (la cantidad actual de café que hay en la cafetera). 
 * Implemente, al menos, los siguientes métodos: 
 * 
 *  Constructor predeterminado o vacío 
 *  Constructor con la capacidad máxima y la cantidad actual 
 *  Métodos getters y setters. 
 *  Método llenarCafetera(): hace que la cantidad actual sea igual a la 
 * capacidad máxima. 
 *  Método servirTaza(int): se pide el tamaño de una taza vacía, el método 
 * recibe el tamaño de la taza y simula la acción de servir la taza con la 
 * capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar 
 * la taza, se sirve lo que quede. El método le informará al usuario si se llenó 
 * o no la taza, y de no haberse llenado en cuanto quedó la taza. 
 * 
 *  Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 *  Método agregarCafe(int): se le pide al usuario una cantidad de café, 
 * el método lo recibe y se añade a la cafetera la cantidad de café indicada. 
 *
 */
public class CafeteraService {

    private Scanner leer = new Scanner(System.in);
    private Cafetera nespresso = new Cafetera();
    
    
    public void crearCafetera() {
        do {
            System.out.println("Ingrese la cantidad máxima de gr de café que puede almacenar la cafetera: ");
            nespresso.setCapacidadMaxima(leer.nextInt());
            if (nespresso.getCapacidadMaxima() < 1) {
                System.out.println("Valor inválido, ingrese una cantidad mayor ");
            }
        } while (nespresso.getCapacidadMaxima() < 1);

        do {
            System.out.println("Ingrese la cantidad actual de gr de cafe que contiene la cafetera: ");
            nespresso.setCantidadActual(leer.nextInt());
            if (nespresso.getCantidadActual() > nespresso.getCapacidadMaxima()) {
                System.out.println("Valor inválido, intente de nuevo");
            }
        } while (nespresso.getCantidadActual() > nespresso.getCapacidadMaxima());

    }

    
    public void llenarCafetera() {
        System.out.println("La cafetera tiene " + nespresso.getCantidadActual() + "gr de café \n Agregar " + (nespresso.getCapacidadMaxima() - nespresso.getCantidadActual()));
        nespresso.setCantidadActual(nespresso.getCapacidadMaxima()); 
    }
    
    
    public void servirTaza(){
        int option;
        int taza = 0;
        String tazaLlena = "";

        do {
            System.out.println("Que tamaño desea?\n1) Pequeno\n2) Mediano\n3) Grande\n4) Extra grande");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    taza = 10;
                    break;
                case 2:
                    taza = 15;
                    break;
                case 3:
                    taza = 20;
                    break;
                case 4:
                    taza = 25;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (option < 1 || option > 4);

        if (option > nespresso.getCantidadActual()) {
            System.out.println("Cantidad de cafe insuficiente. Por favor ingrese mas cafe.");
        } else {
            leer.nextLine(); // Consumir la nueva línea después de leer la opción del tamaño de la taza.
            
            do {
                try {
                    System.out.println("Llenando taza....");
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Su taza quedo llena?");
                tazaLlena = leer.nextLine();

                if (!tazaLlena.equalsIgnoreCase("si") && !tazaLlena.equalsIgnoreCase("no")) {
                    System.out.println("Respuesta invalida. Por favor ingrese 'si' o 'no'.");
                    tazaLlena = "";
                }

            } while (!tazaLlena.equalsIgnoreCase("si"));

            nespresso.setCantidadActual(nespresso.getCantidadActual()-taza);
            System.out.println("Taza servida. Cantidad actual de cafe: " +nespresso.getCantidadActual() );
        } 
    }
    
    
    public void vaciarCafetera(){
       System.out.println("Vaciando cafetera... ");
       nespresso.setCantidadActual(0); 
    }
    
    
    public void agregarCafe(){
       System.out.println("Cuantos gramos de cafe desea agregar? ");
       int cant=leer.nextInt();
       double espacio= nespresso.getCapacidadMaxima()-nespresso.getCantidadActual();
        if (cant>espacio ) {
            System.out.println("esa cantidad sobrepasa el limite, se agregaran solo " + (espacio));
            nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
        }else{
          nespresso.setCantidadActual(cant+nespresso.getCantidadActual());
        }
        System.out.println("cantidad actual de cafe es " + nespresso.getCantidadActual()+ " gramos."); 
    }
    
    
    public void menu(){
         int option;
        do {
            
            System.out.println("Bienvenido que opcion desea \n 1). Llenar completamente la cafetera \n 2). Agregar una cantidad especifica de cafe \n 3). Servir taza \n 4). Vaciar cafetera \n 5). Salir ");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    llenarCafetera();
                    break;
                case 2:
                     agregarCafe();
                    break;
                case 3:
                    servirTaza();
                    break;
                case 4:
                    vaciarCafetera();
                    break;
                case 5:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (option != 5);

    }

}
