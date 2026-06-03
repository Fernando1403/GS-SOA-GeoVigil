package com.geovigil.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cidade;
    private String cep;
    private String nivelRisco;
    private Integer previsaoHoras;
    private LocalDateTime dataGeracao;
}