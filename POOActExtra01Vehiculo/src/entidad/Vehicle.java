
package entidad;

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
public class Vehicle {
    
    private String brand;
    private String model;
    private int year;
    private String type;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year, String type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", type=" + type + '}';
    }
    
    
    
    
}
