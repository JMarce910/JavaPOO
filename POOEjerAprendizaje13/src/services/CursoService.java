

package services;

import entidad.Curso;
import java.util.Scanner;

/** 
 *  método cargarAlumnos(): este método le permitirá al usuario ingresar los 
 * alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
 * esta información en un arreglo e iterar con un bucle, solicitando en cada 
 * repetición que se ingrese el nombre de cada alumno. 
 * 
 *  Método crearCurso(): el método crear curso, le pide los valores de los 
 * atributos al usuario y después se le asignan a sus respectivos atributos para 
 * llenar el objeto Curso. En este método invocaremos al método cargarAlumnos() 
 * para asignarle valor al atributo alumnos 
 * 
 *  Método calcularGananciaSemanal(): este método se encarga de calcular la 
 * ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
 * de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de
 * días a la semana que se repite el encuentro. 
 */
public class CursoService {
    
    private Curso curso = new Curso();
    private Scanner read = new Scanner(System.in);
    
    
    public void crearCurso(){
          System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(read.nextLine());
        
        
        System.out.println("Ingrese la cantidad de horas por dia: ");
        curso.setCantidadHorasPorDia(read.nextInt());
        read.nextLine();
        
        System.out.println("Ingrese la cantidad de dias por semana: ");
        curso.setCantidadDiasPorSemana(read.nextInt());
        read.nextLine();
        
        System.out.println("Ingrese el turno (1: Mañana, 2: Tarde): ");
        curso.setTurno(read.nextInt());
        read.nextLine();
        
        System.out.println("Ingrese el precio por hora: ");
        curso.setPrecioPorHora(read.nextInt());
        read.nextLine();
        
        curso.cargarAlumnos();
    }
    
    
    public int calcularGananciaSemanal(){
        
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
    }
    
}
