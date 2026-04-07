package com.zorvyn.financebackend.controller;

import com.zorvyn.financebackend.model.User;
import com.zorvyn.financebackend.util.RoleUtil;
import com.zorvyn.financebackend.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public String createUser(@RequestBody User user,
                             HttpServletRequest req){

        RoleUtil.checkAdmin(req);

        service.createUser(user);
        return "User created";
    }

    @GetMapping
    public List<User> getUsers(HttpServletRequest req){

        RoleUtil.checkAdmin(req);

        return service.getUsers();
    }
}