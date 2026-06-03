package com.geovigil.model;

public class MonitoramentoClimatico extends Monitoramento {

    @Override
    public String gerarRelatorio() {
        return "Relatório Climático";
    }
}