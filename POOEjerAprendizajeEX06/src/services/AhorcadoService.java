
package services;


import entidades.Ahorcado;
import java.util.Scanner;

/**
 *  Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
 * máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
 * longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
 * quedando cada letra de la palabra en un índice del vector. Y también, guarda 
 * en cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0. 
 * 
 *  Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
 * Nota: buscar como se usa el vector.length. 
 *  Método buscar(letra): este método recibe una letra dada por el usuario y 
 * busca si la letra ingresada es parte de la palabra o no. También informará si 
 * la letra estaba o no. 
 *  Método encontradas(letra): que reciba una letra ingresada por el usuario y
 * muestre cuantas letras han sido encontradas y cuantas le faltan. Este método 
 * además deberá devolver true si la letra estaba y false si la letra no estaba, 
 * ya que, cada vez que se busque una letra que no esté, se le restará uno a
 * sus oportunidades. 
 *  Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 
 */
public class AhorcadoService {

    private Scanner read = new Scanner(System.in);
    private String[] palabraEscondida;

    public Ahorcado crearJuego() {

        System.out.println("Elija la palabra inicial: ");
        String palabra = read.nextLine();

        // Crear instancia de Ahorcado y establecer los valores
        String[] palabraBuscada = palabra.split(""); // Convierte la palabra en un arreglo de letras

        int letrasEncontradas = 0; // Inicialmente no se han encontrado letras
        int intentos = 7; // Establecer el número máximo de jugadas

        return new Ahorcado(palabraBuscada, letrasEncontradas, intentos);
    }

    public void longitud(Ahorcado juego) {
        System.out.println("Longitud de la palabra: " + juego.getPalabraBuscada().length);
    }

    public void buscar(Ahorcado juego, String letra) {
        boolean encontrada = false;
        for (String l : juego.getPalabraBuscada()) {
            if (l.equals(letra)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {

        }
    }
     

    public void encontradas(Ahorcado juego, String letra) {
        int encontradas = 0;
        int faltantes = 0;
        for (String l : juego.getPalabraBuscada()) {
            if (l.equals(letra)) {
                encontradas++;
            } else {
                faltantes++;
            }
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");

    }

    public void intentos(Ahorcado juego) {
        int oportunidadesRestantes = juego.getIntentos() - juego.getLetrasEncontradas();
        System.out.println("Número de oportunidades restantes: " + oportunidadesRestantes);
    }

    public void juego(Ahorcado juego) {
        while (juego.getLetrasEncontradas() < juego.getIntentos()) {
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese una letra:");
            String letra = read.next();

            buscar(juego, letra);
            encontradas(juego, letra);
            intentos(juego);
            juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
    }
}
