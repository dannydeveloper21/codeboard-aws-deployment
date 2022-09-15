package com.example.springnative;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Repository
public class TaskRepository implements InitializingBean {

    private Map<Long, Task> taskRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        this.taskRepository = new HashMap<>();
        log.info("Repository is created.");
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(taskRepository.get(id));
    }

    public Task save(Task task) {
        this.taskRepository.put(task.getId(), task);
        return task;
    }


}
