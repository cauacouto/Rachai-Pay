package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.Despesa;

import java.util.List;

public interface DespesaGateway {

    Despesa save(Despesa despesa);

    List<Despesa> findByGrupoId(Long grupoId);
}
