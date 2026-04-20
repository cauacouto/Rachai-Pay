package com.coutodev.rachai_pay.core.UseCase;

import com.coutodev.rachai_pay.core.Dtos.CriarGrupoInputDto;
import com.coutodev.rachai_pay.core.entities.Grupo;

public interface CriarGrupoUseCase {
    Grupo execute(CriarGrupoInputDto input);
}
