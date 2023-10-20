

package services;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CadenaService {
    
    private Scanner leer = new Scanner(System.in);
    private Cadena frase = new Cadena();
    
    public void crearCadena(){
        
        System.out.println("Ingrese una palabra o frase: "); 
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase().length());
    }
    
    public void mostrarVocales() {
        
        int contadorVocales = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            char caracterActual = frase.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches("[aeiouAEIOU]")) {
                contadorVocales++;
            }
        }
        System.out.println(frase.getFrase() + ": contiene " + contadorVocales + " vocales ");
    }
    
    
    public void invertirFrase(){
        
        String resultado = "";
        String str = frase.getFrase();
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i);
        }
        System.out.println(frase.getFrase() + ": invertida -> " + resultado);
    }
    
    public void vecesRepetido(String letra){
        
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            char caracterActual = frase.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches(letra)) {
                contador++;
            }
        }
        if (contador>0) {
           System.out.println("la letra " +letra+" se repite " + contador + " veces ");
       }else{System.out.println("la letra " +letra+ " no esta en la frase ");}
    }
    
    public void compararLongitud(String cadena){
        
        int length1 = frase.getFrase().length();
        int length2 = cadena.length();

        if (length1 < length2) {
            System.out.println(frase.getFrase() + " es mas corta que: " + cadena);
        } else if (length1 == length2) {
            System.out.println(frase.getFrase() + " es igual que: " + cadena);
        } else {
            System.out.println(frase.getFrase() + " es mas larga que: " + cadena);}
    }
    
    public void unirFrases(String cadena) {
        System.out.println("las frases unidas: " + frase.getFrase() + " " + cadena);

    }

    public void reemplazar(String letra) {
        String newtxt = "";
        for (int i = 0; i < frase.getLongitud(); i++) {
            char caracterActual = frase.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches("[Aa]")) {
                newtxt += letra;
            } else {
                newtxt += frase.getFrase().charAt(i);
            }
        }
        System.out.println(newtxt);
    }

    public void contiene(String letra) {
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            char caracterActual = frase.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches(letra)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("la frase contiene la letra " + letra);
        } else {
            System.out.println("la frase no contiene la letra " + letra);
        }
    }
}
