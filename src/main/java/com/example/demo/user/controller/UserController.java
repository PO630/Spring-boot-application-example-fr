package com.example.demo.user.controller;

import com.example.demo.user.model.User;
import com.example.demo.user.service.UserService;
import com.example.demo.user.view.UserView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @JsonView(UserView.UserViewPublic.class)
    public Iterable<User> findAll()
    {
        return userService.findAll();
    }

    @RequestMapping("/{id}")
    @JsonView(UserView.UserViewPrivate.class)
    public Optional<User> findById(@PathVariable Integer id)
    {
        if( id != null )
        {
            return userService.findById( id );
        }
        return null;
    }

}
