package dev.cami.greetings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")

public class GreetingsController {

    @GetMapping
    public String greet() {
        return "Hola";
    }

    @GetMapping("/formal")
    public String formalGreet() {
        return "Buenos días";
    }

}
