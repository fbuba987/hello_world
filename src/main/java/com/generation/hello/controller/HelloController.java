package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotacões
@RestController
@RequestMapping("/")

public class HelloController {

    @GetMapping
    public String helo(){
        return "<h1>Hello World!</h1>";
    }
    @GetMapping("/bsm")
    public String heelo_2(){
        return "<p>" +
                "<li>Responsabilidade pessoal\n</li>" +
                "<li>Mentalidade de crescimento\n</li>" +
                "<li>Orientação ao futuro\n</li>" +
                "<li>Persistência\n</li>" +
                "<li>Comunicação\n</li>" +
                "<li>Adaptabilidade\n</li>" +
                "<li>Trabalho em equipe\n</li>" +
                "<li>Proatividade\n</li>" +
                "\n</p>";
    }

    @GetMapping("/obj")
    public String objetivos(){
        return "<li>Aprender o Spring boot</li>" +
                "<li>Consolidando o aprendizagem de my sql</h1>";
    }
}
