/*
 */
package pooejeraprendizaje07;

import entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import services.PersonaService;

/**
 * @author Pc
 */
public class POOEjerAprendizaje07 {

    /**
     * @param args the command line argument
     * 
     * A continuación, en la clase main hacer lo siguiente: 
     * Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
     * llamaremos todos los métodos para cada objeto, deberá comprobar si la 
     * persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
     * peso ideal e indicar para cada objeto si la persona es mayor de edad. 
     * 
     * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
     * en distintas variables, para después en el main, calcular un porcentaje 
     * de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso 
     * ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos
     * son mayores de edad y cuantos menores 

     */
    public static void main(String[] args) {
       
       List<Persona> list = new ArrayList<>();
        PersonaService personaService = new PersonaService();
        for (int i = 0; i < 4; i++) {
            list.add(personaService.crearPersona());
        }

        int total = list.size();
        int contImcBajo = 0;
        int contImcNormal = 0;
        int contImcAlto = 0;
        int contMayor = 0;
        int contMenor = 0;
        
        
        for (int i = 0; i < total; i++) {
         switch (personaService.calcularIMC(list.get(i))) {
             case -1:
                 contImcBajo++;
             break;
             case -0:
                 contImcNormal++;
             break;
             default:
                 contImcAlto++;
         }
             
            if ( personaService.esMayorDeEdad(list.get(i))) {
                contMayor++; 
            }else{ contMenor++;  }
        }
        
         
        System.out.println("Porcentaje de personas por debajo del peso ideal: " + contImcBajo * 100.0 / total + "%");
        System.out.println("Porcentaje de personas en peso ideal: " + contImcNormal * 100.0 / total + "%");
        System.out.println("Porcentaje de personas por encima del peso ideal: " + contImcAlto * 100.0 / total + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + contMayor * 100.0 / total + "%");
    }
    
}
