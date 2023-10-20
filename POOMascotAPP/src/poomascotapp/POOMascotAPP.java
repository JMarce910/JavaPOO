
package poomascotapp;

import java.util.Scanner;
import poomascotapp.entidades.Mascota;
import poomascotapp.servicios.ServicioMascota;


public class POOMascotAPP {

   
    public static void main(String[] args) {
        
// 23a. Creo el servicio mascota
    ServicioMascota servMasc = new ServicioMascota();
    
    // voy a llamar al metodo crear mascota 2 veces para crear 2 mascotas asi:
    servMasc.crearMascota();
    servMasc.crearMascota();
    
    // y llamo al metodo mostrar mascota
    servMasc.mostrarMascotas();
    }
        
//// 16a. creo el servicio mascota y vuelvo al servicio para continuar con COLECCIONES
//        ServicioMascota sm = new ServicioMascota();
//        //Mascota m2 = sm.crearMascota();
//        
//// 6. creo un scanner para poder introducir cosas por teclado
//        Scanner read = new Scanner(System.in);
//        
//// 3. crear el objeto en el main
//        Mascota m1 = new Mascota("Marco", "Baby", "Perro");
//// 8. si me paro entre los parentesis de mascota y le doy ctrl space, me sugiere los
//// 3 constructores que tiene Mascota, seleccionamos el que queramos y va asi:
////mirar arriba.
//       
//// 4. asiganr valores a los atibutos del objeto m1 que creé este paso lo puedo saltar 
//// despues de crear los constructores
//       // m1.apodo = "Luki";
//       // m1.nombre = "Lukas";
//// 6a. para introducir el nombre por teclado y no como esta arriba utilizo el codigo 
//// de abajo y para eso creo el Scanner
//        // m1.nombre= read.next();
//
//        // m1.tipo = "Perro";
//        // m1.color = "Dorado";
//        // m1.edad = 11;
//        // m1.raza = "Labrador";
//        
//// 5. mostrar los datos de m1 en la consola
//        //System.out.println(m1.nombre+ " // " + m1.tipo + " // " + m1.raza + " // " + m1.color);
//        
//// 10. si queremos cambiarle un valor a la mascota q estamos creando, x eje vamos a cambiarle
//// el nombre a la mascota m1
//        //m1.nombre = "Marco"; asi se reasigna un valor en el atributo, esto se hace cuando los
//// atributos estan de forma public
////pero lo que debo hacer es encapsular, y para ello ponemos los atributos private...10a...
//
//// 12. para llamar ese set le doy ctrl espacio:
//        m1.setNombre("Lukas");
//    
//// para mostrarlo por pantalla con el sout:
//        //System.out.println(m1.getNombre());
//        
//// 14. para imprimir el toString:
//        System.out.println(m1.toString());
//        
//        System.out.println(m2.toString());
//    }
//    
//// 15. creo un nuevo paquete de servicios, y en el la clase ServicioMascota...
    
}
