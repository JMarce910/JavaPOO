
package services;

import entidad.Vehicle;
import java.util.Scanner;

/**
 * Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" 
 * (En tipo, vamos a indicar si es un automóvil, una motocicleta, o una bicicleta). 
 * El vehículo debe tener los métodos de moverse y frenar: 
 * Moverse: Es la cantidad de metros que avanzará por segundo.
 * Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de 
 * la bicicleta, se frenará y no avanzarámás metros
 * 
 * Referencias:
 * Un automóvil avanza 3 metros por segundo.
 * Una motocicleta avanza 2 metros por segundo.
 * Una bicicleta avanza 1 metro por segundo.
 * 
 * Una vez realizado el programa, crear 3 vehículos diferentes (entre todos 
 * elegir que tipo de vehículo es), y mostrar porpantalla cuanto avanzan si se 
 * mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego 
 * mostrar que vehículo logró llegar más lejos luego de frenar, tras avanzar 
 * durante 5 minutos, y cual fue la cantidad de metros queavanzó
 */
public class VehicleService {
    
    
    public Vehicle createVehicle() {

        Scanner read = new Scanner(System.in);
        String type;

        System.out.println("Ingrese la marca: ");
        String brand = read.nextLine();

        System.out.println("Ingrese el modelo: ");
        String model = read.nextLine();

        System.out.println("Ingrese el año: ");
        int year = read.nextInt();
        //limpiar buffer de memoria
        read.nextLine();

        //validate type
        do {
            
            System.out.println("Ingrese el tipo de vehiculo: ");
            type = read.nextLine();
        } while (!type.equalsIgnoreCase("car") && !type.equalsIgnoreCase("motorcycle") && !type.equalsIgnoreCase("bike"));

        return new Vehicle(brand, model, year, type);
    }
    
    public int moveVehicle(Vehicle vehicle, int time){
        
        switch(vehicle.getType().toLowerCase()){
            case "car":
                return time * 3;
            case "motorcycle":
                return time * 2;
            case "bike":
                return time;
                
            default:
                System.out.println("No es un vehiculo disponible.");
                break;
        }
        
        return 0;
    }
    
    public int breakVehicle(Vehicle vehicle, int time){
        
        switch(vehicle.getType().toLowerCase()){
            case "car":
                return (time * 3) + 2;
            case "motocycle":
                return (time * 2) + 2;
            case "bike":
                return time;
            default:
                System.out.println("No es un vehiculo disponible.");
                break;
        }
        return 0;
	}
    }
    

