package com.geovigil.interfaces;

import com.geovigil.dto.AlertaDTO;

public interface IAlertaService {

    AlertaDTO gerarAlerta(Long sensorId);
}