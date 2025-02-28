/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BICHO
 */
class Curso {
     private List<Estudiante> estudiantes;
    
    public Curso(){
        this.estudiantes = new ArrayList<>();    
        }
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("no hay estudiantes inscritos");
            return 0;
        }
        
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNotaFinal();
        }
        return suma / estudiantes.size();
    }
    public void mostrarAprobados() {
        System.out.println("Estudiantes aprobados: ");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.aprobado()) {
                System.out.println(estudiante.getNombre() + " - Carnet: " + estudiante.getCarnet() + "Nota: " + estudiante.getNotaFinal());
            }
        }
    }
}
