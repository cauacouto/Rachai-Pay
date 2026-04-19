package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.UserModel;

import java.util.Optional;
import java.util.UUID;

public interface UserGateway {

    UserModel save(UserModel userModel);
    Optional<UserModel> findByIdd(UUID id);

}
