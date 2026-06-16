package com.example.taskmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    @Test
    public void testAddTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("Tarea 1", "Descripción de la tarea 1", "2024-05-01");
        taskService.addTask(task);
        Assertions.assertNotNull(taskService.getTask("Tarea 1"));
    }
    
    @Test
    public void testGetTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("Tarea 2", "Descripción de la tarea 2", "2024-05-02");
        taskService.addTask(task);
        Assertions.assertEquals(task, taskService.getTask("Tarea 2"));
    }
    
    @Test
    public void testGetTaskNotFound() {
        TaskService taskService = new TaskService();
        Assertions.assertNull(taskService.getTask("Tarea inexistente"));
    }
}