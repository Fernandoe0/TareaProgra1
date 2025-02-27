/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class Alarma {
    private int tiempoObjetivo;
    
    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }
    
    public int getTiempoObjetivo(){
        return tiempoObjetivo;
    }
    
    public void sonar() {
        System.out.println("!Tiempo alcanzado: " + tiempoObjetivo + " segundos.");
        
    }

}
