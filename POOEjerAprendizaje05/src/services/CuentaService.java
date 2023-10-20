/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CuentaService {
    
    private Scanner leer = new Scanner(System.in);
    private CuentaBancaria cuenta = new CuentaBancaria();
    
    public void cuenta(){
        System.out.println("Ingrese su DNI: ");
        cuenta.setDNI(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su saldo actual: ");
        cuenta.setSaldoActual(leer.nextDouble());
        menu();
    }
    
    public void ingresar(){
        System.out.println("Cuánto dinero desea ingresar?: ");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextDouble());
        consultarSaldo();
    }
    
    
    public void retirar(){
        if (cuenta.getSaldoActual()== 0){
            System.out.println("Cuenta vacia!");
        }else{
            System.out.println("Cuánto dinero desea retirar?: ");
            double retiro = leer.nextDouble();
            if (retiro > cuenta.getSaldoActual()){
                System.out.println("Fondos insuficientes. ");
            } else{
                cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
                consultarSaldo();
            }
        }
    }
    
    public void extraccionRapida(){
       if (cuenta.getSaldoActual() == 0) {
            System.out.println("su cuenta esta vacia ");
        } else {
            double fast = cuenta.getSaldoActual() * 0.2;
            cuenta.setSaldoActual(cuenta.getSaldoActual() - fast);
            System.out.println("retiro " + String.format("%,.0f", fast));
            consultarSaldo();
        }      
    }

    public void consultarSaldo() {
      System.out.println("su saldo actual es " + String.format("%,.0f", cuenta.getSaldoActual()));  
    }
    
    public void menu() {
        int option;
        do {
            System.out.println("Bienvenido! Que opción desea: \n 1). Ingresar saldo \n 2). Retirar saldo \n 3). Extracción rápida (20% del saldo) \n 4). Consultar saldo \n 5). Salir ");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    extraccionRapida();
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    System.out.println("Hasta luego, esperamos que vuelvas pronto");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (option != 5);

    }
    
}
