package com.example.dockerhw21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/h")
     public String helloWorld() {
        return "Привет";
    }
}
