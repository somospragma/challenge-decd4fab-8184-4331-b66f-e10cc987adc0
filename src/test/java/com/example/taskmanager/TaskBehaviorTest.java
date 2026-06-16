package com.example.taskmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskBehaviorTest {
    @Test
    public void testTaskCreationAndRetrieval() {
        TaskService taskService = new TaskService();
        Task task = new Task("Tarea 3", "Descripción de la tarea 3", "2024-05-03");
        taskService.addTask(task);
        Assertions.assertNotNull(taskService.getTask("Tarea 3"));
        Assertions.assertEquals(task, taskService.getTask("Tarea 3"));
    }
}