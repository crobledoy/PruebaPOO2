
package com.mycompany.pruebapoo2;


public class Administrativo extends Persona{
    
        private String cargo; 
        
        public Administrativo(String nombre, String rut, String cargo) {
            super(nombre, rut);
            this.cargo = cargo;
            
        }
    
        @Override
        public String obtenerRol(){
            return "Administrativo";
            
        }

        @Override 
        public void mostrarFicha(){
            super.mostrarFicha();
            System.out.println("Cargo: " + cargo);
            
        }

}
