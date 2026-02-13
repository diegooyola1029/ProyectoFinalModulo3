package com.devsenior;

import com.devsenior.taskmanager.service.TaskManager;
import com.devsenior.taskmanager.exception.TareaNoEncontradaException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void testAgregarTarea() {
        TaskManager manager = new TaskManager();
        manager.agregarTarea("Tarea de prueba");

        assertEquals(1, manager.listarTareas().size());
    }

    @Test
    void testEliminarTarea() throws TareaNoEncontradaException {
        TaskManager manager = new TaskManager();
        manager.agregarTarea("Eliminar tarea");

        manager.eliminarTarea(1);

        assertEquals(0, manager.listarTareas().size());
    }

    @Test
    void testTareaNoEncontrada() {
        TaskManager manager = new TaskManager();

        assertThrows(
                TareaNoEncontradaException.class,
                () -> manager.eliminarTarea(99));
    }
}
