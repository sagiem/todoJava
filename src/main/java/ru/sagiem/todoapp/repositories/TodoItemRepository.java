package ru.sagiem.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sagiem.todoapp.model.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
