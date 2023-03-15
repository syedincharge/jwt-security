package com.rizvi.jwt.service;


import com.rizvi.jwt.dao.RoleDao;
import com.rizvi.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){

      return  roleDao.save(role);
    }
}
