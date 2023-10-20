
package ejercicioaprendizaje01;

import java.util.Scanner;

/**
 * @author Pc
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    
    // constructor vacío
    public Libro() {
        
    }

    // constructor con parámetros
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // método para cargar libro pidiendo datos a usuario
    public void cargarLibro() {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el número de ISBN: ");
        ISBN = leer.nextLine();
        
        System.out.print("Ingrese el título del libro: ");
        titulo = leer.nextLine();
        
        System.out.print("Ingrese el nombre del autor: ");
        autor = leer.nextLine();
        
        System.out.print("Ingrese el número de páginas: ");
        numPaginas = leer.nextInt();
    }

    // método para informar datos del libro
    public void mostrarInfo() {

        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Nuúmero de páginas: " + numPaginas);
        System.out.println(" ");
        System.out.println("----------------------------------");
    }

}
