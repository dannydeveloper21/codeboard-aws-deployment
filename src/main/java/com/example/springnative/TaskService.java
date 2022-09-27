package com.example.springnative;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task save(Task task) {
        task.setCreation_date(new Date());
        log.info("Task: {}", task.toString());
        return this.taskRepository.save(task);
    }

    public Task findById(Long id) {
        return this.taskRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
