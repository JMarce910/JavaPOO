
package pooejeraprendizaje10v2;

import entidad.Array1;
import java.util.Arrays;


public class POOEjerAprendizaje10v2 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa en Java donde se creen dos arreglos: el primero será 
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 
     * números, también reales. El programa deberá inicializar el arreglo A con 
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al 
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el 
     * valor 0.5. 
     * Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el 
     * combinado de 20.
     */
    public static void main(String[] args) {
        
        Array1 array1 = new Array1();
        array1.llenarArray();
        System.out.println("Array 1");
        System.out.println(Arrays.toString(array1.getArray1()));
        System.out.println("Array 2");
        System.out.println(Arrays.toString(array1.getArray2()));
        System.out.println("Array 1 ordenado");
        array1.ordenarArray1();
        System.out.println(Arrays.toString(array1.getArray1()));
        System.out.println("Reorganizar Array 2");
        array1.reorganizarArray2();
        System.out.println(Arrays.toString(array1.getArray2()));
    }
    
}
    