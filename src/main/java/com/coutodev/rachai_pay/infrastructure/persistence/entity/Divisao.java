package com.coutodev.rachai_pay.infrastructure.persistence.entity;

import com.coutodev.rachai_pay.core.enums.StatusPagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Divisao_TB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Divisao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "Despesa_Id")
    private Despesa despesa;
    @ManyToOne()
    @JoinColumn(name = "User_Id")
    private User user;
    private BigDecimal valor;
    private StatusPagamento status;
    private String abacatePayId;

}
