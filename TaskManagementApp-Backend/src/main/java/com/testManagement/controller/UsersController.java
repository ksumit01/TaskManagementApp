package com.testManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testManagement.model.Users;
import com.testManagement.repository.UsersRepo;
import com.testManagement.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;
    
    @Autowired
    private UsersRepo ur;

    @GetMapping("/login")
    public ResponseEntity <Users>  login(@RequestParam String email, @RequestParam String password) {
       
    	usersService.login(email, password);
    	
    	
		
		return new ResponseEntity<>(ur.findByEmail(email), HttpStatus.OK );
            
        
    }

    @PostMapping("/signup")
    public Users signUp(@RequestBody Users user) {
        return usersService.signUp(user);
    }
  
}
