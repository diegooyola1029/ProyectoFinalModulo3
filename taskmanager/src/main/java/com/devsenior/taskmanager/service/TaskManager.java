package com.devsenior.taskmanager.service;

import com.devsenior.taskmanager.model.Tarea;
import com.devsenior.taskmanager.exception.TareaNoEncontradaException;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Tarea> tareas = new ArrayList<>();
    private int contadorId = 1;

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(contadorId++, descripcion));
    }

    public List<Tarea> listarTareas() {
        return tareas;
    }

    public void completarTarea(int id) throws TareaNoEncontradaException {
        buscarTarea(id).completar();
    }

    public void eliminarTarea(int id) throws TareaNoEncontradaException {
        tareas.remove(buscarTarea(id));
    }

    private Tarea buscarTarea(int id) throws TareaNoEncontradaException {
        return tareas.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElseThrow(() -> new TareaNoEncontradaException(
                        "No existe la tarea con ID " + id));
    }
}
