package com.boots.service;

import com.boots.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByName(String name);
    Set<Role> getSetOfRoles(String[] roleNames);
    void add(Role role);
    void edit(Role role);
    Role getById(Long id);
}
