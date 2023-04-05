package devs.toz.todolistmicroservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @GetMapping("/")
    public String working()
    {
        return "It works";
    } //Create a basic working endpoint
}
