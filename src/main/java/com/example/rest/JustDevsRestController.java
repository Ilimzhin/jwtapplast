package com.example.rest;

import com.example.model.JustDeveloper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/developers")
public class JustDevsRestController {

    private List<JustDeveloper> justDevelopers = Stream.of(
            new JustDeveloper(1L, "Azamat","Alimbek u."),
            new JustDeveloper(2L, "Aida","Valieva"),
            new JustDeveloper(3L, "Ilim","Valiev")
    ).collect(Collectors.toList());

    @GetMapping
    public List<JustDeveloper> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public JustDeveloper getById(@PathVariable Long id) {
        return null;
    }

}
