package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.pixQrcode;

import java.math.BigDecimal;

public interface paymentGateway {


    pixQrcode generatePix(BigDecimal amount, String description);
}
