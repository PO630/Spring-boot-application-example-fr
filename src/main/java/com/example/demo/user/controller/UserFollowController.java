package com.example.demo.user.controller;

import com.example.demo.user.model.UserFollow;
import com.example.demo.user.service.UserFollowService;
import com.example.demo.user.view.UserFollowView;
import com.example.demo.user.view.UserView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userFollow")
public class UserFollowController {

    @Autowired
    private UserFollowService userFollowService;

    @RequestMapping("/findAll")
    @JsonView( UserFollowView.UserFollowViewPublic.class )
    public Iterable<UserFollow> findAll()
    {
        return userFollowService.findAll();
    }



}
