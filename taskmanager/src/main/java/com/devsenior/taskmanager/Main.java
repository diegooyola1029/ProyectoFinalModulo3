package com.devsenior.taskmanager;

import com.devsenior.taskmanager.model.Tarea;
import com.devsenior.taskmanager.service.TaskManager;
import com.devsenior.taskmanager.exception.TareaNoEncontradaException;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        System.out.println("=== INICIO DEL PROGRAMA ===");

        manager.agregarTarea("Estudiar Java");
        manager.agregarTarea("Hacer proyecto DevSenior");
        manager.agregarTarea("Probar TaskManager");

        System.out.println("\nTareas creadas:");
        for (Tarea t : manager.listarTareas()) {
            System.out.println(
                    t.getId() + " - " + t.getDescripcion() +
                            " - Completada: " + t.isCompletada());
        }

        try {
            manager.completarTarea(2);
            manager.eliminarTarea(1);
        } catch (TareaNoEncontradaException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nTareas finales:");
        for (Tarea t : manager.listarTareas()) {
            System.out.println(
                    t.getId() + " - " + t.getDescripcion() +
                            " - Completada: " + t.isCompletada());
        }

        try {
            manager.eliminarTarea(99);
        } catch (TareaNoEncontradaException e) {
            System.err.println("\nExcepción controlada correctamente:");
            System.err.println(e.getMessage());
        }

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
