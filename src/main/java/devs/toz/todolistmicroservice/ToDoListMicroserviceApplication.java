package devs.toz.todolistmicroservice;

import devs.toz.todolistmicroservice.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ToDoListMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListMicroserviceApplication.class, args);
    }
    private TestController testController;
    @GetMapping("/test")
    public String test() {
        return testController.working();
    }
}
