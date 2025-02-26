/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class TareaProgra1 {

    public static void main(String[] args) {
        //Instanciar cuenta bancaria 1
        //CuentaBancaria(String numeroCuenta, String nombre, double saldo, String tipoCuenta)
        CuentaBancaria cuenta1 = new CuentaBancaria(11700432, "Luis Equite", 1152.50, "Ahorro");
        cuenta1.depositar(500);
        cuenta1.retirar(30);
        System.out.println("Saldo actual: $" + cuenta1.consultarSaldo());
        cuenta1.retirar(2000); // Intento de retiro mayor al saldo disponible
        
        cuenta1.mostrarInformacion();
    }
}
