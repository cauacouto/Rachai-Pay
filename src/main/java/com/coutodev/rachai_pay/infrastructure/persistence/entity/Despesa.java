package com.coutodev.rachai_pay.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Despesa_TB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Despesa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String descricao;
    private BigDecimal valorTotal;
    @ManyToOne
    @JoinColumn(name = "grupo_Id")
    private Grupo grupo;
    private LocalDate data;
}
