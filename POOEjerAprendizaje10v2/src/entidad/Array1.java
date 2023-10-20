/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Arrays;

/**
 *
 * @author Pc
 */
public class Array1 {
    
    private int array1[] = new int[50];
    private double array2[] = new double[20];

    public void llenarArray() {
        for (int i = 0; i < 50; i++) {
            int aleatorio = (int) (Math.random() * 31);
            this.array1[i] = aleatorio;
        }
        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 31);
            this.array2[i] = aleatorio;
        }
    }

    public void ordenarArray1() {
        Arrays.sort(array1);
    }

    public void reorganizarArray2() {
        Arrays.fill(array2, 10, 20, 0.5);
    }

    public int[] getArray1() {
        return array1;
    }

    public double[] getArray2() {
        return array2;
    }

}
