package com.coutodev.rachai_pay.core.UseCase;

import com.coutodev.rachai_pay.core.Dtos.CriarDespesaInputDto;
import com.coutodev.rachai_pay.core.entities.Despesa;

public interface CriarDespesaUseCase {

    Despesa execute(CriarDespesaInputDto input);
}
