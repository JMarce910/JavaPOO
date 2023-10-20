

package pooejeraprendizajeex01;

import entidades.Cancion;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el 
 * titulo y el autor a cadenas vacías y otro que reciba como parámetros el 
 * titulo y el autor de la canción. Se deberán además definir los métodos 
 * getters y setters correspondientes. 
 */
public class POOEjerAprendizajeEX01 {

    
    public static void main(String[] args) {
        
        Cancion song = new Cancion("Fix you", "Coldplay");
        System.out.println(song.getAutor());
        System.out.println(song.getTitulo());
    }
    
}
