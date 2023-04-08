package devs.toz.todolistmicroservice.controllers;

import devs.toz.todolistmicroservice.model.ToDoList;
import devs.toz.todolistmicroservice.model.ToDoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final ToDoListRepository repository;
    @GetMapping("/test")
    public String working() {
        ToDoList toDoList = new ToDoList();
        repository.save(toDoList);
        return "It works";
    }
}
