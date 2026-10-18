
package com.mycompany.pruebapoo2;


public class Docente extends Persona implements Auditable, Exportable {
    
    private String especialidad;
    
    public Docente(String nombre, String rut, String especialidad) {
        super(nombre, rut);
        this.especialidad = especialidad; 
    }
    
    @Override 
    public String obtenerRol(){
        return "Docente";
    }
    
    @Override
    public void registrarAccion(String accion) {
        System.out.println("[BITACORA]" + nombre + ": " + accion);
        
    }
    
    @Override
    public String exportarCSV(){
        return nombre + "," + rut + "," + especialidad;
    }
    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Especialidad: " + especialidad);
        
    }
}
