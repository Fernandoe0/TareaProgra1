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
        System.out.println("\n");
        System.out.println("\n");
        
        //prueba de Termómetro
        //instancia de Termómetro
        Termometro termometro = new Termometro(32);
        System.out.println("Temperatura en Celsius: " + termometro.getCelsius()+ "°C");
        System.out.println("Temperatura en Kelvin: " + termometro.kelvin() + "K");
        System.out.println("Temperatura en Fahrenheit: " + termometro.fahrenheit() + "°F");
        
        
        System.out.println("\n");
        System.out.println("\n");


        
        Producto producto1 = new Producto("AN101123","Cilindro de motor", 750.00);
        producto1.mostrarInformacion();

        // Intentamos asignar un precio negativo
        producto1.setPrecio(-50);
        producto1.setPrecio(650.00);
        System.out.println("\n");
        producto1.mostrarInformacion();
        
          System.out.println("\n");
          
         Temporizador temporizador = new Temporizador();
         Alarma alarma = new Alarma(15);
         
         temporizador.setAlarma(alarma);
         temporizador.iniciar(15);
         
         System.out.println("\n");
         
         Curso curso = new Curso();

        // Agregamos estudiantes
        curso.agregarEstudiante(new Estudiante("Pancho Pistolas", "7590-12-51281", 85));
        curso.agregarEstudiante(new Estudiante("Peter Parker", "7590-15-54585", 74));
        curso.agregarEstudiante(new Estudiante("Rigoberta Menchú", "7590-15-54585", 59)); // Reprobado
        curso.agregarEstudiante(new Estudiante("Juan Carlos Plata", "7590-25-546905", 92));
        curso.agregarEstudiante(new Estudiante("Benito Carlos", "7590-16-54955", 40)); // Reprobado
        curso.agregarEstudiante(new Estudiante("Alma Marcela", "7590-19-54574", 110)); // Nota inválida

        // Mostramos el promedio del curso
        System.out.println("Promedio del curso: " + curso.calcularPromedio());

        // Mostramos los estudiantes aprobados
        curso.mostrarAprobados();
    }
    
    
    }
