package com.coutodev.rachai_pay.core.gateway;

import com.coutodev.rachai_pay.core.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface UserGateway {

    User save(User user);
    Optional<User> findByIdd(UUID id);

}
