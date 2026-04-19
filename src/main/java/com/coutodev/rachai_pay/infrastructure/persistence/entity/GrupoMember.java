package com.coutodev.rachai_pay.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "GrupoMember_TB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GrupoMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Grupo grupo;
    private BigDecimal valor;
}
