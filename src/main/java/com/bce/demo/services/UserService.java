package com.bce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bce.demo.dao.UserRepository;
import com.bce.demo.controllers.entities.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> finAll() {
        return userRepository.findAll();
    }   

    public User create(User user) {
        return userRepository.save(user);
    }   

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

}
