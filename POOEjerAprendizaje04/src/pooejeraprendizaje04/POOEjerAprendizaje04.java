/*
 *
 */
package pooejeraprendizaje04;

import services.RectanguloService;


public class POOEjerAprendizaje04 {

    /**
     * @param args the command line arguments
     * 
     * Ej 04
     * Crear una clase Rectángulo que modele rectángulos por medio de un 
     * atributo privado base y un atributo privado altura. La clase incluirá un 
     * método para crear el rectángulo con los datos del Rectángulo dados por 
     * el usuario. También incluirá un método para calcular la superficie del 
     * rectángulo y un método para calcular el perímetro del rectángulo. 
     * Por último, tendremos un método que dibujará el rectángulo mediante 
     * asteriscos usando la base y la altura. Se deberán además definir los 
     * métodos getters, setters y constructores correspondientes. 
     * Superficie = base * altura / Perímetro = (base + altura) * 2. 
     */
    public static void main(String[] args) {
        
        // Instancio un objeto de tipo servicio para acceder a sus metodos
        RectanguloService service = new RectanguloService();
        // Llamo el metodo crear Rectangulo
        service.crearRectangulo();
        
        
        // Imprimo los resultados y llamo el metodo dibujar Rectangulo
        System.out.println("La superficie del rectángulo es: " + service.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + service.calcularPerimetro());
        service.dibujarRectangulo();
    }
    
}
