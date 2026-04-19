package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.GrupoMember;

import java.util.List;
import java.util.UUID;

public interface GrupoMemberGateway {

    GrupoMember save(GrupoMember grupoMember);

    List<GrupoMember> findByGrupoId(Long grupoId);

    List<GrupoMember> findByUserId(UUID UserId);

    Boolean existsByGrupoIdAndUserId(Long id,UUID UserId);
    void deleteByGrupoIdAndUserId(Long grupoId, Long userId);
}
