package com.geovigil.dto;

import lombok.Data;

@Data
public class SensorDTO {

    private String localizacao;
    private Double nivelRio;
    private Double precipitacao;
}