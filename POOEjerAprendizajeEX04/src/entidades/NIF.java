
package entidades;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class NIF {
    
    private long dni;
    private String letra;
    private static final String[] LETRAS = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public long getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public void crearNif() {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        dni = read.nextLong();
        int resto = (int) (dni % 23);
        letra = LETRAS[resto];
    }

    public void mostrar() {
        String dniString = String.format("%08d", dni);
        System.out.println(dniString + "-" + letra);
    }
    
    
}
