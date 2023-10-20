/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Pc
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    private double intereses;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long DNI, double saldoActual, double intereses) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.intereses = intereses;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
 
    
    
}
