

package poomascotapp.servicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import poomascotapp.entidades.Mascota;


public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
// 17. COLECCIONES
   // Agrego una nueva variable o atributo global de la clase SERVICIO
    private List<String> mascotas;
    
// 18. lo inicializamos a traves del constructor

    public ServicioMascota() {
        this.mascotas = new ArrayList();
    }
    
    
// 15a. aqui voy a crear el metodo crearMascota y crear una nueva mascota   
    //public Mascota crearMascota(){
    
// 19. vuelvo el metodo crearMascota() un void para que no me de el return, sino que 
// cada que yo lo llame, el me guarde el objeto en la Lista
    
    public void crearMascota(){
        
        System.out.println("Introducir el nombre de la mascota: ");
        String nombre = leer.next();
        
        System.out.println("Introducir el apodo de la mascota: ");
        String apodo = leer.next();

        System.out.println("Ingrese el tipo de mascota: (Perro, Gato, etc...)");
        String tipo = leer.next();

        //Mascota m = new Mascota(nombre, apodo, tipo);
        //return m;
        
// 20. Creo una variable mascota para luego ir guardandolas cuando llame al metodo
// crear mascota
        String mascota = nombre +  " '" + apodo + "' " + tipo;

// 21. Ahora guardo la mascota
        mascotas.add(mascota);

// 16. me voy al main a crear el servicio...
    }
    
    
// 22. Ahora creo otro método para visualizar las mascotas creadas
    public void mostrarMascotas(){
        
        System.out.println("La cantidad de mascotas son: " + mascotas.size());
        
        System.out.println("Las mascotas en la Lista son: ");
        for (String aux : mascotas) {
            System.out.println(aux);
        }
    }
    
// 23. Enseguida me voy al main para crear el servicio mascota
    
}
