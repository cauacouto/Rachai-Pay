package com.coutodev.rachai_pay.core.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {

    private Long id;
    private String descricao;
    private BigDecimal valorTotal;
    private Long grupoId;
    private LocalDate data;
}
