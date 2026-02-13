TaskManager - Aplicación CRUD de Tareas en Java
1. Descripción

TaskManager es una aplicación desarrollada en Java que permite gestionar tareas mediante operaciones CRUD (Crear, Listar, Completar y Eliminar).

El proyecto fue construido con el objetivo de aplicar buenas prácticas de desarrollo, estructura profesional con Maven y pruebas unitarias utilizando JUnit 5.

2. Objetivo del Proyecto

Desarrollar una aplicación en Java que permita:

Crear tareas

Listar tareas registradas

Marcar tareas como completadas

Eliminar tareas

Manejar excepciones personalizadas

Validar el comportamiento mediante pruebas unitarias

3. Arquitectura del Proyecto

El proyecto sigue la estructura estándar de Maven:

taskmanager-maven/
│
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/devsenior/taskmanager/
    │           ├── Main.java
    │           ├── service/
    │           │   └── TaskManager.java
    │           ├── model/
    │           │   └── Tarea.java
    │           └── exception/
    │               └── TareaNoEncontradaException.java
    │
    └── test/
        └── java/
            └── com/devsenior/taskmanager/
                └── TaskManagerTest.java
4. Componentes del Sistema
4.1 Tarea.java (Modelo)

Representa una tarea dentro del sistema.

Atributos:

id (int)

descripcion (String)

completada (boolean)

Responsabilidades:

Almacenar la información de cada tarea

Permitir marcar una tarea como completada

4.2 TaskManager.java (Servicio)

Contiene la lógica del negocio y las operaciones CRUD.

Métodos principales:

agregarTarea(String descripcion)

listarTareas()

completarTarea(int id)

eliminarTarea(int id)

Internamente utiliza una lista para almacenar las tareas en memoria.

4.3 TareaNoEncontradaException.java

Excepción personalizada que se lanza cuando se intenta completar o eliminar una tarea que no existe.

Permite manejar errores de forma controlada y profesional.

4.4 Main.java

Clase principal que ejecuta el flujo del programa:

Crea tareas

Lista tareas

Completa una tarea

Elimina una tarea

Maneja excepciones

Muestra el estado final del sistema

4.5 TaskManagerTest.java

Contiene pruebas unitarias desarrolladas con JUnit 5.

Las pruebas validan:

Que se agreguen tareas correctamente

Que se eliminen tareas correctamente

Que se lance la excepción cuando corresponde

5. Tecnologías Utilizadas

Java 17

Maven

JUnit 5

Programación Orientada a Objetos

Manejo de Excepciones Personalizadas

6. Dependencias

El proyecto utiliza Maven para la gestión de dependencias.

Dependencia principal de pruebas:

org.junit.jupiter:junit-jupiter:5.10.0

Plugins configurados:

Maven Surefire Plugin (ejecución de pruebas)

Exec Maven Plugin (ejecución de la clase Main)

7. Cómo Compilar el Proyecto

Desde la carpeta raíz donde se encuentra el pom.xml:

mvn clean compile
8. Cómo Ejecutar la Aplicación
mvn exec:java
9. Cómo Ejecutar las Pruebas
mvn test
10. Ejemplo de Salida
=== INICIO DEL PROGRAMA ===

Tareas creadas:
1 - Estudiar Java - Completada: false
2 - Hacer proyecto DevSenior - Completada: false
3 - Probar TaskManager - Completada: false

Tareas finales:
2 - Hacer proyecto DevSenior - Completada: true
3 - Probar TaskManager - Completada: false

Excepción controlada correctamente:
No existe la tarea con ID 99

=== FIN DEL PROGRAMA ===
11. Estado del Proyecto

Estructura Maven correctamente configurada

CRUD funcional

Manejo de excepciones implementado

Pruebas unitarias exitosas

Código organizado por capas (model, service, exception)

12. Posibles Mejoras Futuras

Interfaz interactiva por consola

Persistencia en base de datos

Implementación con Spring Boot

Exposición como API REST

Integración de logging profesional

Este proyecto representa una implementación básica pero estructurada de un sistema CRUD en Java, aplicando principios fundamentales de diseño y pruebas automatizadas.
