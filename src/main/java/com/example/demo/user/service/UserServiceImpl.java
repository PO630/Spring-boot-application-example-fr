package com.example.demo.user.service;

import com.example.demo.user.model.User;
import com.example.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements com.example.demo.user.service.UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findById(Integer id) {

        return userRepository.findById(id);

    }

    @Override
    public Iterable<User> findAll()
    {
        return userRepository.findAll() ;
    }

    @Override
    public void save( User user )
    {
        userRepository.save( user ) ;
    }


}
