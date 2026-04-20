package com.coutodev.rachai_pay.core.UseCase;

import com.coutodev.rachai_pay.core.entities.pixQrcode;

public interface gerarPixUseCase {
   pixQrcode execute(Long divisaoId);
}
