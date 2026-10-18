
package com.mycompany.pruebapoo2;

        
    
public class Estudiante extends Persona {
    
    private double promedio;
    
    public Estudiante(String nombre, String rut, double promedio) {
        
        super(nombre, rut);
        this.promedio = promedio; 
    }    

    @Override
    public String obtenerRol(){
        return "Estudiante";
    }
    @Override 
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Promedio: " + promedio);
        
    }
}
