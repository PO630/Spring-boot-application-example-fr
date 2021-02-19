package com.example.demo;

import com.example.demo.user.model.User;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Component
@RestController
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/help")
	String help() {
		return "Help page";
	}

	@RequestMapping("/user")
	String userF() {

		Optional<User> userI = userService.findById(1) ;
		if( userI.isPresent() ) {
			return userI.get().getName() ;
		}
		return "Aucun utilisateur";
	}

	public static void main(String[] args) {

		SpringApplication.run( DemoApplication.class, args );

	}

}
