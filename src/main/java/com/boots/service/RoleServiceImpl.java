package com.boots.service;

import com.boots.dao.RoleDao;
import com.boots.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.Set;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {

        this.roleDao = roleDao;
    }

    @Override
    @Transactional(readOnly = true)
    public Set<Role> getAllRoles() {

        return roleDao.getAllRoles();
    }

    @Override
    @Transactional(readOnly = true)
    public Role getRoleByName(String name) {

        return roleDao.getRoleByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public Set<Role> getSetOfRoles(String[] roleNames) {
        return
                roleDao.getSetOfRoles(roleNames);
    }

    @Override
    @Transactional(readOnly = true)
    public void add(Role role) {

        roleDao.add(role);
    }

    @Override
    @Transactional(readOnly = true)
    public void edit(Role role) {

        roleDao.edit(role);
    }
    //изменён на обёртку в связи с последнем замечанием в 2.3.1
    @Override
    @Transactional(readOnly = true)
    public Role getById(Long id) {

        return roleDao.getById(id);
    }
}