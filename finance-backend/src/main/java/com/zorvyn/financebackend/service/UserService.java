package com.zorvyn.financebackend.service;

import com.zorvyn.financebackend.model.User;
import com.zorvyn.financebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public void createUser(User user){
        repo.save(user);
    }

    public User findByEmail(String email){
        return repo.findByEmail(email);
    }

    public List<User> getUsers(){
        return repo.findAll();
    }

}