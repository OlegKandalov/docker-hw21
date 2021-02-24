package com.example.dockerhw21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final InfoRepository infoRepository;

    @Autowired
    public Controller(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    @GetMapping(value = "/info")
     public List<Picture> getInfo() {
        return infoRepository.findAll();
    }
}
