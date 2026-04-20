package com.coutodev.rachai_pay.core.UseCase;

import com.coutodev.rachai_pay.core.entities.Divisao;

import java.util.List;
import java.util.UUID;

public interface DividirDespesaUseCase {
    List<Divisao> execute(Long despesaId);
}
