package com.coutodev.rachai_pay.core.UseCase;

import java.util.UUID;

public interface AdicionarMembroUseCase {
    void execute(Long grupoId, UUID userId);
}
