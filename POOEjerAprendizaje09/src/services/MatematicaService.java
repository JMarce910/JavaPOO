

package services;

import entidad.Matematica;
import java.util.Scanner;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números 
 * reales con los cuales se realizarán diferentes operaciones matemáticas. 
 * La clase deber tener un constructor vacío, parametrizado y get y set.
 * 
 * En el main se creará el objeto y se usará el Math.random para generar los
 * dos números y se guardaran en el objeto con su respectivos set. Deberá 
 * además implementar los siguientes métodos: 
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
 * b) Método calcularPotencia() para calcular la potencia del mayor valor de
 * la clase elevado al menor número. Previamente se deben redondear ambos valores. 
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los 
 * dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
 * absoluto del número. 
 **/

public class MatematicaService {
    
    private Scanner leer = new Scanner(System.in);
    private Matematica math = new Matematica();
    
    
    public void crearNum() {
       
        math.setNum1((int) ((float) Math.random()*10));
        math.setNum2((int) ((float) Math.random()*10));

    }

    public void devolverMayor() {
        if (math.getNum1() > math.getNum2()) {
            System.out.println("El número mayor es: " + math.getNum1() + " y el número menor es: " + math.getNum2());
            calcularPotencia(math.getNum1(), math.getNum2());
            calculaRaiz(math.getNum2());
        } else {
            System.out.println("El número mayor es: " + math.getNum2() + " y el número menor es: " + math.getNum1());
            calcularPotencia(math.getNum2(), math.getNum1());
            calculaRaiz(math.getNum1());
        }
    }

    public void calcularPotencia(float n1, float n2) {
        float potencia = (float) Math.pow(n1, n2);
        System.out.println(n1 + "^" + n2 + " = " + potencia);

    }

    public void calculaRaiz(float n1) {
        System.out.println("La raiz de " + n1 + " = " + Math.sqrt(Math.abs(n1)));
    }
    
}
