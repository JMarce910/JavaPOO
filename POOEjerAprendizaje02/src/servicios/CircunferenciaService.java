/*
 */
package servicios;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CircunferenciaService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia() {
        System.out.println("Introduce el radio de la circunferencia: ");
        
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    public double calcularArea(Circunferencia circunferencia) {
        return Math.PI * Math.pow(circunferencia.getRadio(), 2);
    }

    public double calcularPerimetro(Circunferencia circunferencia) {
        return 2 * Math.PI * circunferencia.getRadio();
    }
    
}
