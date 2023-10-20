

package pooejeraprendizaje10;

import java.util.Arrays;
import java.util.Random;



public class POOEjerAprendizaje10 {

    /**
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
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // Inicializamos arregloA con números aleatorios
        Random rand = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = rand.nextDouble() * 100;
        }

        // Ordenamos arregloA de menor a mayor
        Arrays.sort(arregloA);
        // Copiamos los primeros 10 elementos ordenados de arregloA a arregloB
        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        // Rellenamos los 10 últimos elementos de arregloB con el valor 0.5
        Arrays.fill(arregloB, 10, 20, 0.5);

        // Mostramos los arreglos resultantes
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(arregloB));
    }
}
 
