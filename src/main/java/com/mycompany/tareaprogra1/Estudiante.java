/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class Estudiante {
    private String carnet;
    private String nombre;
    private double notaFinal;

    public Estudiante(String carnet, String nombre, double notaFinal) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal < 0 || notaFinal > 100) {
            System.out.println("Error La nota debe ser entre 0 y 100");
            this.notaFinal = 0;
        } else {
        this.notaFinal = notaFinal;
    }
  }
    public boolean aprobado () {
        return notaFinal >= 61;
    }
    
}
