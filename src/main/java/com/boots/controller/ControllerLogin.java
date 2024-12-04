package com.boots.controller;

import com.boots.model.User;
import com.boots.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLogin {

    @GetMapping("/")
    public String home() {

        return "redirect:/login";
    }
    public UserDetails loadUserByUsername(String email, UserRepository userRepository) throws UsernameNotFoundException {
        User user = userRepository.getUserByEmail(email);
        user.getAuthorities().size();
        if (user == null) {
            throw new UsernameNotFoundException(String.format("Пользователь с email = '%s' не найден", email));
        }
        return user.fromUser();
    }
}