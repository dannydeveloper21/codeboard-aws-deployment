package com.example.springnative;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task save(@RequestBody Task task){
        return this.taskService.save(task);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        return this.taskService.findById(id);
    }
}
