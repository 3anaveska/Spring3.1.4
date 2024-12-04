package com.boots.controller;

import com.boots.model.User;
import com.boots.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping
    public User getAuthorisedUser (Principal principal) {
        return userService.findByUsername(principal.getName());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById (@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getById(id));
    }
}