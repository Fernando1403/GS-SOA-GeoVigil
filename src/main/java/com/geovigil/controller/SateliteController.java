package com.geovigil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SateliteController {

    @GetMapping("/api/satelites")
    public String listar() {
        return "Satelites funcionando";
    }
}