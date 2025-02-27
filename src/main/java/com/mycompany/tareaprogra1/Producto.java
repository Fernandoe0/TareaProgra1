/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprogra1;

/**
 *
 * @author BICHO
 */
public class Producto {
    String idProducto;
    String nombre;
    double precio;

    //constructor
    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("ingresar un precio mayor a Cero");
        }
        else {
        this.precio = precio;
    }
    }
    
    public void mostrarInformacion() {
        System.out.println("Código: " + idProducto + "\n" + 
                           "Nombre: " + nombre + "\n"+
                           "Precio: Q." + precio);
    }
}
    
    

