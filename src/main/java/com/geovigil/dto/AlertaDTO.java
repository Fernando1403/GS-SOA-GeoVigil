package com.geovigil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlertaDTO {

    private String cidade;
    private String cep;
    private String nivelRisco;
    private Integer previsaoHoras;
}