

package ejercicioaprendizaje02;

import entidad.Circunferencia;
import servicios.CircunferenciaService;

/*
 * @author Pc
 */
public class POOejercicio02 {

    /**
     * Declarar una clase llamada Circunferencia que tenga como atributo privado
     * el radio de tipo real. A continuación, se deben crear los siguientes métodos: 
     * 
     * a) Método constructor que inicialice el radio pasado como parámetro. 
     * b) Métodos get y set para el atributo radio de la clase Circunferencia. 
     * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en
     * el atributo del objeto. 
     * d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio2).
     * e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
     */
    public static void main(String[] args) {
       
        //Instanciamos un objeto del tipo servicio para acceder a sus métodos
       CircunferenciaService service = new CircunferenciaService();

       //Alojamos el retorno del metodo en un objeto tipo circunferencia
        Circunferencia circ = service.crearCircunferencia();
        
        System.out.println("Radio de la circunferencia: " + circ.getRadio());

        System.out.println("Area de la circunferencia: " + service.calcularArea(circ));
        System.out.println("Perímetro de la circunferencia: " + service.calcularPerimetro(circ));
    }
    
}
