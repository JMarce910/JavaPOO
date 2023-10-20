/*
 *
 */
package ejercicioaprendizaje01;


public class POOejercicio01 {

    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos: 
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
     * atributos pasados por parámetro y un constructor vacío. Crear un método 
     * para cargar un libro pidiendo los datos al usuario y luego informar 
     * mediante otro método el número de ISBN, el título, el autor del libro 
     * y el numero de páginas. 
     */
    public static void main(String[] args) {
        
        //Creación objeto o instanciación
        Libro libro1 = new Libro();
        
        //Llamado de los métodos
        libro1.cargarLibro();
        libro1.mostrarInfo();
        
        Libro libro2 = new Libro("84-95618-60-5", "El Código Da Vinci", "Brown. Dan", 557);
        libro2.mostrarInfo();
    }
    
}
