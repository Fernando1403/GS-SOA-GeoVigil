package com.geovigil.controller;

import com.geovigil.dto.AlertaDTO;
import com.geovigil.interfaces.IAlertaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alertas")
public class AlertaController {

    private final IAlertaService alertaService;

    public AlertaController(IAlertaService alertaService) {
        this.alertaService = alertaService;
    }

    @PostMapping("/gerar/{sensorId}")
    public AlertaDTO gerar(
            @PathVariable Long sensorId
    ) {
        return alertaService.gerarAlerta(sensorId);
    }
}