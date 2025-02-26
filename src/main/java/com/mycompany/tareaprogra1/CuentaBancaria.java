/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private String nombre;
    private double saldo;
    private String tipoCuenta;
    
    public CuentaBancaria(int numeroCuenta, String nombre, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Fondos insuficientes para realizar el retiro.");
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public void mostrarInformacion () {
        System.out.println("\n" + "\n" + "No. de Cuenta: "+ numeroCuenta  + "\n"  +
                           "Nombre: " + nombre  + "\n" + 
                           "saldo: Q. " + saldo + "\n" +
                           "Tipo de Cuenta: " + tipoCuenta);
}
    
}
