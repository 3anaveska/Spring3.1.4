package com.boots.service;

import com.boots.model.Role;

import java.util.List;

public interface RoleService {
    void add (Role role);
    Role getById (Long id);
    List<Role> getRoles(Long [] ides);
}
