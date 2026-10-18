
package com.mycompany.pruebapoo2;


public class Main {
    
    
    public static void main(String[] args) {
        
        Estudiante estudiante1 =
                new Estudiante("Ana", "11.111.111-1", 6.2);
        
        Docente docente1 = 
                new Docente("Luis", "22.222.222-2", "Programacion");
        
        Administrativo administrativo1 =
                new Administrativo("Maria", "33.333.333-3", "Secretaria");
        
        
        
        System.out.println(estudiante1.obtenerRol());
        
        System.out.println(docente1.obtenerRol());
        
        System.out.println(administrativo1.obtenerRol());
        
        Persona[] personas = {
            estudiante1,
            docente1,
            administrativo1
            
        };
        
        for (Persona p : personas){
            p.mostrarFicha();
            System.out.println("--------------");
        }
        System.out.println("SIN POLIMORFISMO");

    for (Persona p : personas) {

    if (p instanceof Estudiante) {
        Estudiante e = (Estudiante) p;
        e.mostrarFicha();

    } else if (p instanceof Docente) {
        Docente d = (Docente) p;
        d.mostrarFicha();
        

    } else if (p instanceof Administrativo) {
        Administrativo a = (Administrativo) p;
        a.mostrarFicha();
    }

    }
    System.out.println("-------------");
        docente1.registrarAccion("Ingreso al sistema");
        
        System.out.println(docente1.exportarCSV());
        
        
        
    }
    
  }
