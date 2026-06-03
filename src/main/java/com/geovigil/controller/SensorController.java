package com.geovigil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorController {

    @GetMapping("/api/sensores")
    public String listar() {
        return "Sensores funcionando";
    }
}