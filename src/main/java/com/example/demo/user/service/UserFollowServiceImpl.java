package com.example.demo.user.service;

import com.example.demo.user.model.UserFollow;
import com.example.demo.user.repository.UserFollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserFollowServiceImpl implements  UserFollowService{

    @Autowired
    private UserFollowRepository userFollowRepository;

    @Override
    public Iterable<UserFollow> findAll()
    {
        return userFollowRepository.findAll() ;
    }


}
