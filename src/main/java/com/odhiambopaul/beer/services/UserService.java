package com.odhiambopaul.beer.services;

import com.odhiambopaul.beer.web.model.UserDTO;

import java.util.UUID;

public interface UserService {
    UserDTO getUserById(UUID userId);
}
