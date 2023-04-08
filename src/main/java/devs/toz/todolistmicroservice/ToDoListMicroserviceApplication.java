package devs.toz.todolistmicroservice;

import devs.toz.todolistmicroservice.model.ToDoList;
import devs.toz.todolistmicroservice.model.ToDoListRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/toDoList")
public class ToDoListMicroserviceApplication {

    private final ToDoListRepository toDoListRepository;

    public ToDoListMicroserviceApplication(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ToDoListMicroserviceApplication.class, args);
    }

    @GetMapping
    public List<ToDoList> getToDoList(){
        return toDoListRepository.findAll();
    }
}
