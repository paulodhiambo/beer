package com.odhiambopaul.beer.services;

import com.odhiambopaul.beer.web.model.UserDTO;

import java.util.UUID;

public interface UserService {
    UserDTO getUserById(UUID userId);

    UserDTO insertUser(UserDTO userDTO);

    void updateUser(UUID userId, UserDTO userDTO);

    void deleteById(UUID userId);
}
