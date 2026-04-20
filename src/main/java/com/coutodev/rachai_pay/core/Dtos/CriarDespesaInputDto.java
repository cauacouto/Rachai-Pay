package com.coutodev.rachai_pay.core.Dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CriarDespesaInputDto {

    private Long id;
    private String descricao;
    private BigDecimal valorTotal;
    private Long grupoId;
    private LocalDate data;
}
