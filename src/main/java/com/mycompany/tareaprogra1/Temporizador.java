/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class Temporizador {
    private double tiempoInicial;
    private Alarma alarma;
    
    public Temporizador (){
        this. tiempoInicial = 0;
        this.alarma = null;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
    
    public void iniciar (int duracion) {
        for (int i = 1; i <=duracion; i++){
            tiempoInicial = i;
            System.out.println("Tiempo actual: " + tiempoInicial + "segundos.");
          
            if (alarma != null && tiempoInicial == alarma.getTiempoObjetivo()) {
                alarma.sonar();
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Temporizador interrumpido");
            }
        }
    }
    public double getTiempoInicial(){
        
        return tiempoInicial;
    }

   
}

