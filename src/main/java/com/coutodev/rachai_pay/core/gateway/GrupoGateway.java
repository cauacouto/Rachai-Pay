package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.Grupo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GrupoGateway {

    Grupo save(Grupo grupo);
    Optional<Grupo> findById(Long id);
    List<Grupo> findByUserId(UUID user);
    List<Grupo> findByCriadorId(Long criadorId);
}
