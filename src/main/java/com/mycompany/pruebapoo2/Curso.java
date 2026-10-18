/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo2;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private List<Estudiante> inscritos;
    
    // ASOCIACION:
// El Docente y el Curso existen de manera independiente.
    private Docente docente;

    public Curso(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
        this.inscritos = new ArrayList<>();
    }

    // AGREGACION:
    // El estudiante existe por separado y llega desde afuera.
    public void inscribir(Estudiante e) {
        inscritos.add(e);
    }
}
