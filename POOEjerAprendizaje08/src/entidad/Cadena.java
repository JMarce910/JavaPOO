
package entidad;

/**
 *
 * @author Pc
 */
public class Cadena {
    
    String frase;
    int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int length() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
