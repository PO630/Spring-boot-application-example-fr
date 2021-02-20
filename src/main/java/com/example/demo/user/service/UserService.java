package com.example.demo.user.service;

import com.example.demo.user.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(Integer id);

    Iterable<User> findAll();

    void save( User user ) ;


}
