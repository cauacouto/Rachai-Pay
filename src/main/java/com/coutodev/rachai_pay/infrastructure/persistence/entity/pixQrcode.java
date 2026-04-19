package com.coutodev.rachai_pay.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Table(name = "Pix_TB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class pixQrcode {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private BigDecimal amount;
   private String description;
}
