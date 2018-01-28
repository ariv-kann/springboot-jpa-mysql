package com.example.springjpah2demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpah2demo.domain.Users;
import com.example.springjpah2demo.repo.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public List<Users> getUsers(){
		return userRepository.findAll(); 
	}
}
