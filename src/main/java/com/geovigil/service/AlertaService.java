package com.geovigil.service;

import com.geovigil.dto.AlertaDTO;
import com.geovigil.interfaces.IAlertaService;
import com.geovigil.model.Alerta;
import com.geovigil.repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AlertaService implements IAlertaService {

    private final AlertaRepository alertaRepository;

    public AlertaService(AlertaRepository alertaRepository) {
        this.alertaRepository = alertaRepository;
    }

    @Override
    public AlertaDTO gerarAlerta(Long sensorId) {

        String risco = "BAIXO";

        if (sensorId % 2 == 0) {
            risco = "ALTO";
        }

        Alerta alerta = new Alerta();

        alerta.setCidade("São Paulo");
        alerta.setCep("04250-000");
        alerta.setNivelRisco(risco);
        alerta.setPrevisaoHoras(72);
        alerta.setDataGeracao(LocalDateTime.now());

        alertaRepository.save(alerta);

        return new AlertaDTO(
                alerta.getCidade(),
                alerta.getCep(),
                alerta.getNivelRisco(),
                alerta.getPrevisaoHoras()
        );
    }
}