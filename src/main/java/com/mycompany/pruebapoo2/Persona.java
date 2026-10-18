/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo2;

// Persona es abstracta porque representa el concepto general.
// En el sistema se crean Estudiantes, Docentes o Administrativos,
// no una Persona genérica.

public abstract class Persona {
    
    protected String nombre; 
    protected String rut;
    
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
        
    }


    public void mostrarFicha() {
        System.out.println(nombre + " | " + rut);
        
    }

    public abstract String obtenerRol();

} 