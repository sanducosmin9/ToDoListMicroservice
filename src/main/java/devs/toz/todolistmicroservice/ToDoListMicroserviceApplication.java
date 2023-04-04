package devs.toz.todolistmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ToDoListMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListMicroserviceApplication.class, args);
    }

    @GetMapping("/")
    public String working()
    {
        return "I am working";
    }
}
