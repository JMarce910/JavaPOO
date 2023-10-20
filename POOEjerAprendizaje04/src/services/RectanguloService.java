/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class RectanguloService {

    // CREAR NUEVOS OBJETOS: SCANNER Y RECTANGULO
    Scanner leer = new Scanner(System.in);
    private Rectangulo rectangulo = new Rectangulo();

    // METODO PARA CREAR RECTANGULO
    public void crearRectangulo() {

        System.out.println("Ingrese la base del rectángulo: ");
        // UTILIZAMOS AL OBJETO PARA INVOCAR AL METODO SET
        rectangulo.setBase(leer.nextDouble());

        System.out.println("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(leer.nextDouble());

    }

    // METODO PARA CALCULAR LA SUPERFICIE
    public double calcularSuperficie() {

        // Aqui hace la operacion y OBTIENE el valor de la base que ya se ingreso
        // Y retorna ese valor
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    // METODO PARA CALCULAR PERIMETRO
    public double calcularPerimetro() {

        return (rectangulo.getBase() + rectangulo.getAltura()) * 2;
    }

    // METODO PARA DIBUJAR RECTANGULO
    public void dibujarRectangulo() {
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 || j == 0 || j == rectangulo.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
