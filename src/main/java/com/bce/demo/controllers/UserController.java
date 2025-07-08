package com.bce.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bce.demo.controllers.entities.User;
import com.bce.demo.services.UserService;

@RestController //se usa @RestController para definir que esta clase es un controlador REST
@RequestMapping("/api/usuario")   // se usa @RequestMapping para definir la ruta base
@CrossOrigin("*")
public class UserController {

    //se usa @Autowired para inyectar el servicio UserService
    @Autowired
    private UserService userService;

    //se usa getMapping para definir el método HTTP GET
    @GetMapping("")   
    public List<User> getAllUserr() {
        return userService.finAll();
    }

    //se usa postMapping para definir el método HTTP POST
    //se usa @RequestBody para indicar que el cuerpo de la solicitud contiene un objeto User
    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }   

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Integer userId) {
        return userService.getUserById(userId);
    }
}
