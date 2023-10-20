

package entidad;

import java.util.Scanner;

/**
Una tienda que vende teléfonos móviles quiere tener registro de cada producto 
que posee en un sistema computacional. Para ello, crearemos un programa donde 
se pueda almacenar cada producto con su información. Crear una entidad Movil 
con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo. 
El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada 
subíndice alojará un número correspondiente al código. A continuación, se 
implementarán los siguientes métodos: 

 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Método cargarCelular(): se solicita al usuario que ingrese los datos 
necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo 
de siete números de un celular. Para ello, puede utilizarse un bucle repetitivo
**/

public class Movil {
    
    private String marca;
    private int precio;
    private String modelo;
    private double memoriaRam;
    private double almacenamiento;
    private int codigo[] = new int[7];
    
    Scanner read = new Scanner(System.in);

    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, double memoriaRam, double almacenamiento, int codigo[]) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
  
}
