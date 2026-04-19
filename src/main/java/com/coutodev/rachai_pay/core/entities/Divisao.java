package com.coutodev.rachai_pay.core.entities;

import com.coutodev.rachai_pay.core.enums.StatusPagamento;

import java.math.BigDecimal;
import java.util.UUID;

public class Divisao {

    private Long id;
    private Long despesaId;
    private UUID userId;
    private BigDecimal valor;
    private StatusPagamento status;
    private String paymentId;

}
