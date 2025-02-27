/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class Termometro {
    private double celsius;
    
    //Constructor 
    public Termometro(double celsius) {
        this.celsius = celsius;
    }
    //Getter para obtener la temperatura en celsius
    public double getCelsius() {
        return celsius;
    }
    //setter para indicar la temperatura
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    //convertir Celcius a Kelvin con fórmula (celsius + 273.15=K)
    public double kelvin(){
        return celsius + 273.15;
    }
    
    //convertir celsius a Fahrenheit con fórmula ((celsius *(9/5))+32)=F
    public double fahrenheit(){
        return (celsius *(9/5)+32);
    }
    
    
}
