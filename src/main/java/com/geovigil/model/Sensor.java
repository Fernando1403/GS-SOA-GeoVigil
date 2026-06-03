package com.geovigil.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String localizacao;
    private Double nivelRio;
    private Double precipitacao;
}