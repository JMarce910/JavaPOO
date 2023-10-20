
package entidades;

import java.util.Arrays;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
 contener como atributos, un vector con la palabraBuscada a buscar, la cantidad de 
 letrasEncontradas encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
 * Definir los siguientes métodos con los parámetros que sean necesarios: 
 * 
 *  Constructores, tanto el vacío como el parametrizado. 
 */

public class Ahorcado {
    
    private String[] palabraBuscada;
    private int letrasEncontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscada, int letrasEncontradas, int intentos) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
    }

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + 
                "palabraBuscada=" + Arrays.toString(palabraBuscada) + 
                ", letrasEncontradas=" + letrasEncontradas + ", intentos=" + intentos + '}';
    }

    
}
