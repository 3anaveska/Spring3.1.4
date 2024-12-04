package com.boots.service;

import com.boots.model.User;
import com.boots.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@AllArgsConstructor
@Transactional
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;
    @Getter
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        User existingUser = (User) userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Пользователь не найден с помощью метода удаления в классе UserServiceImp"));
        userRepository.delete(existingUser);
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(Long id) {
        return (User) userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Пользователь с таким id не найден в классе UserServiceImp"));
    }

    @Override
    @Transactional(readOnly = true)
    public User findByUsername(String email) {

        return userRepository.getUserByEmail(email);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByEmail(username);
        user.getAuthorities().size();
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User '%s' not found", username));
        }
        return user.fromUser();
    }

}