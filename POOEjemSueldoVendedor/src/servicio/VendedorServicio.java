package servicio;

import entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class VendedorServicio {
// 7. lleno los atributos y para eso creo el Scanner    
    Scanner leer = new Scanner(System.in);

// 5. Primero crear un método que retorne un objeto del tipo vendedor que se llame:
    public Vendedor altaVendedor() {

// 6. intanciar un objeto del tipo vendedor
        Vendedor v1 = new Vendedor();
        
        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(leer.next());
        
        System.out.println("Ingrese el dni del vendedor: ");
        v1.setDni(leer.nextInt());
        
        System.out.println("Ingrese el sueldo básico del vendedor: ");
        v1.setSueldoBasico(leer.nextDouble());
        
        System.out.println("Ingrese el día que empezó a trabajar: ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes que empezó a trabajar: ");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año que empezó a trabajar: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        v1.setFechaInicio(fecha);
        return v1;

    }
    
// 8. Crear un método que ayude a calcular las comisiones del mes y el sueldo total
// que se le debe pagar en el mes que genero las comisiones. De tipo void para que no
// retorne, pero se le pasa por párametro del tipo vendedor en el cual quiero que se
// realicen estos cáculos:
    
    public void SueldoMensual(Vendedor v1) {
        System.out.println("Ingrese cuáles fueron las ventas totales del vendedor: ");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: "
        + v1.getNombre() + " es de $" + v1.getSueldoMensual());
    }
    
// 9. Crear otro método que calcule la antigüedad del vendedor para así determinar
// los dias de vacaciones que le corresponden
    
    public void vacaciones(Vendedor v1){
        Date hoy = new Date();
    // calculo la antigüedad con esta fórmula
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
    // analizo para determinar los dias que le corresponden
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if(antiguedad > 10) {
            System.out.println("Le corresponden 21 dias");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias");
        } else{
            System.out.println("El empleado tiene vacaciones proporcionales");   
        }
// 10. Ahora vamos al main...
        
    }


}
