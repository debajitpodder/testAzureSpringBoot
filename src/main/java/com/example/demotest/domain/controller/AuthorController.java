package com.example.demotest.domain.controller;


import com.example.demotest.domain.entity.Authors;
import com.example.demotest.domain.repository.AuthorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {

    @Autowired
    private AuthorsRepo authorsRepo;

    @GetMapping("/authors")
    public List<Authors> getAllAuthors() {
        return authorsRepo.findAll();
    }

    @PostMapping("/authors")
    public Authors createAuthors( @RequestBody Authors user) {
       System.out.println("display users::"+user.toString());
        return authorsRepo.save(user);
    }
}
