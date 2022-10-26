package com.example.demotest.domain.controller;


import com.example.demotest.domain.entity.Authors;
import com.example.demotest.domain.entity.Publishers;
import com.example.demotest.domain.repository.PublishersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PublisherController {

    @Autowired
    private PublishersRepo publishersRepo;

    @GetMapping("/publishers")
    public List<Publishers> getAllPublishers() {
        return publishersRepo.findAll();
    }

    @PostMapping("/publishers")
    public Publishers createPublishers( @RequestBody Publishers publishers) {
        System.out.println("display users::"+publishers.toString());
        return publishersRepo.save(publishers);
    }

}
