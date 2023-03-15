package com.rizvi.jwt.service;

import com.rizvi.jwt.dao.RoleDao;
import com.rizvi.jwt.dao.UserDao;
import com.rizvi.jwt.entity.Role;
import com.rizvi.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    public User registerNewUser(User user){

       return userDao.save(user);
    }

    public void initRolesAndUser(){

        Role adminRole = new Role();

        adminRole.setRoleName("ADMIN");
        adminRole.setRoleDescription("Admin of the Application");
        roleDao.save(adminRole);


        Role userRole = new Role();

        userRole.setRoleName("USER");
        userRole.setRoleDescription("Default Role for newly created record");
        roleDao.save(userRole);


        User adminUser = new User();

        adminUser.setUserFirstName("Admin");
        adminUser.setUserLastName("Admin");
        adminUser.setUserName("Admin123");
        adminUser.setUserPassword("admin@pass");

        userDao.save(adminUser);

        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);


        User user = new User();

        user.setUserFirstName("Syed");
        user.setUserLastName("Rizvi");
        user.setUserName("syed123");
        user.setUserPassword("syed@pass");

        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userDao.save(user);
    }

}
