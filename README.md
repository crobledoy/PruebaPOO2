# PruebaPOO2

Proyecto desarrollado para practicar Programación Orientada a Objetos en Java.

## Diseño del proyecto

La clase abstracta Persona representa la clase general del sistema.

De Persona heredan:
- Estudiante
- Docente
- Administrativo

Docente implementa las interfaces:
- Auditable
- Exportable

El proyecto utiliza herencia, abstracción, interfaces, sobrescritura de métodos y polimorfismo.

También se implementan las siguientes relaciones:

- Curso y Docente: asociación.
- Curso y Estudiante: agregación.
- Factura y Detalle: composición.

## Diagrama UML

```mermaid
classDiagram

Persona <|-- Estudiante
Persona <|-- Docente
Persona <|-- Administrativo

Auditable <|.. Docente
Exportable <|.. Docente

Curso --> Docente : asociacion
Curso o-- Estudiante : agregacion
Factura *-- Detalle : composicion

class Persona {
    <<abstract>>
    #String nombre
    #String rut
    +mostrarFicha()
    +obtenerRol()
}

class Estudiante {
    -double promedio
}

class Docente {
    -String especialidad
}

class Administrativo {
    -String cargo
}

class Auditable {
    <<interface>>
    +registrarAccion(String accion)
}

class Exportable {
    <<interface>>
    +exportarCSV()
}

class Curso {
    -String nombre
}

class Factura {
}

class Detalle {
    -String producto
    -int cantidad
}
