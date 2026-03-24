package dev.cami.miprimerapirest.miprimerapirest.controllerapirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")

public class ControllerApiRest {
    @GetMapping

    public String saludar(){
        return "Hola! Camila Osorio";
    }
    }
