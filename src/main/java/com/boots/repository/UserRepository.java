package com.boots.repository;

import com.boots.model.Role;
import com.boots.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByEmail(String username);

    //Set<Role> findRoles(List<Long> roles);

    Optional<Object> findById(Long id);
}
