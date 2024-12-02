package com.boots.dao;

import com.boots.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    User getUserByEmail(String email);
    void addUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void removeUserById(Long id);
    List<User> listUsers();
}
