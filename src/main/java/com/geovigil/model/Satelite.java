package com.geovigil.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Satelite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String origem;
    private String resolucao;
}