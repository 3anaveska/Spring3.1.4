package com.boots.service;

import com.boots.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User add (User user);
    User update (User user);
    void delete (Long id);
    List<User> getAllUsers();
    User getById (Long id);
    User findByUsername (String username);

}