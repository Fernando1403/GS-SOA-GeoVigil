package com.geovigil.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class HistoricoClimatico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cidade;
    private Double temperaturaMedia;
    private Double chuvaAcumulada;
}