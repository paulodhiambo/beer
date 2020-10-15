package com.odhiambopaul.beer.services;

import com.odhiambopaul.beer.web.model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO getUserById(UUID userId) {
        return UserDTO.builder()
                .id(UUID.randomUUID())
                .name("Paul Odhiambo")
                .build();
    }
}
