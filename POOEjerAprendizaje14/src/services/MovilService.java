

package services;

import entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 Método cargarCelular(): se solicita al usuario que ingrese los datos 
necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.
* 
 Método ingresarCodigo(): este método permitirá ingresar el código completo 
de siete números de un celular. Para ello, puede utilizarse un bucle repetitivo
**/
public class MovilService {
    
    private Movil movil = new Movil();
    private Scanner read = new Scanner(System.in);
    
    public void cargarCelular(){
        System.out.println("Ingrese la marca del celular: ");
        movil.setMarca(read.nextLine());
        System.out.println("Ingrese el precio del celular: ");
        movil.setPrecio(read.nextInt());
        read.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        movil.setModelo(read.nextLine());
        System.out.println("Ingrese la cantidad de memoria RAM: ");
        movil.setMemoriaRam(read.nextDouble());
        read.nextLine();
        System.out.println("Ingrese la capacidad de almacenamiento: ");
        movil.setAlmacenamiento(read.nextDouble());
        read.nextLine();
       
       } 
       
    
    public void ingresarCodigo(){
        System.out.println("Ingrese el codigo del equipo: ");
        String product = read.nextLine();
        
        int codigo[] = new int[product.length()];
        for(int i = 0; i < product.length(); i++){
            int number = Character.getNumericValue(product.charAt(i));
            codigo[i] = number;
        }
        movil.setCodigo(codigo);
    }
    
    public void mostrar(){
        System.out.println(" Marca: " + movil.getMarca());
        System.out.println(" Precio: $ " + movil.getPrecio());
        System.out.println(" Modelo: " + movil.getModelo());
        System.out.println("Memoria RAM: " + movil.getMemoriaRam() + " Gb");
        System.out.println("Almacenamiento: " + movil.getAlmacenamiento() + " Gb");
        System.out.println("Código: ");
        System.out.println(Arrays.toString(movil.getCodigo()));
        System.out.println("");
    } 
}
