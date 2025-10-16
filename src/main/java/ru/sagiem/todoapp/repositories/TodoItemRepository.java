package ru.sagiem.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sagiem.todoapp.model.TodoItem;

import java.util.List;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    List<TodoItem> findByTitleContainingIgnoreCase(String title);
}
