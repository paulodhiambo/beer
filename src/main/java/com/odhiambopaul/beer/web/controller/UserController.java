package com.odhiambopaul.beer.web.controller;

import com.odhiambopaul.beer.services.UserService;
import com.odhiambopaul.beer.web.model.UserDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/{userId}"})
    public ResponseEntity<UserDTO> getUser(@PathVariable UUID userId) {
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity insertUser(@RequestBody UserDTO userDTO) {
        UserDTO userDTO1 = userService.insertUser(userDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/user/" + userDTO1.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{userId}"})
    public ResponseEntity handleUserUpdate(@PathVariable("userId") UUID userId, @RequestBody UserDTO userDTO) {
        userService.updateUser(userId, userDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{userId}"})
    public void deleteUser(@PathVariable("userId") UUID userId) {
        userService.deleteById(userId);
    }
}
