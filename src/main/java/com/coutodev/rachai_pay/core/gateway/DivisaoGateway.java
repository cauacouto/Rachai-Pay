package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.Divisao;

import java.util.List;
import java.util.UUID;

public interface DivisaoGateway {

    Divisao save(Divisao divisao);
    List<Divisao> findByDespesaId(Long despesaId);
    List<Divisao> findByUserId(UUID UserId);
}
