package com.boots.service;

import com.boots.model.Role;
import com.boots.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class RoleServiceImp implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public void add(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getById(Long id) {
        return roleRepository.getById(id);
    }

    @Override
    public List<Role> getRoles(Long [] ides) {
        return roleRepository.findAll();

    }
}