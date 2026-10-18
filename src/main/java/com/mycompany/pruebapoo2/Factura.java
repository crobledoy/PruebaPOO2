/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo2;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private List<Detalle> detalles;

    public Factura() {
        this.detalles = new ArrayList<>();
    }

    // COMPOSICION:
    // La Factura crea sus propios Detalle internamente.
    public void agregarLinea(String producto, int cantidad) {
        detalles.add(new Detalle(producto, cantidad));
    }
}
