package com.testManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testManagement.exception.InvalidCredentialException;
import com.testManagement.exception.NotFoundException;
import com.testManagement.model.Users;
import com.testManagement.repository.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersRepo usersRepo;	
	
	@Override
	public Users login(String email, String password) throws InvalidCredentialException, NotFoundException {
		// TODO Auto-generated method stub
		
		Users user = usersRepo.findByEmail(email);

	    // If user is not found, throw NotFoundException
	    if (user == null) {
	        throw new NotFoundException("User not found.");
	    }

	    // If the user's password doesn't match the provided password, throw InvalidCredentialException
	    if (!password.equals(user.getPassword())) {
	        throw new InvalidCredentialException("Invalid password.");
	    }

	    return user;
		
	}

	@Override
	public Users signUp(Users user) {
		// TODO Auto-generated method stub
		return usersRepo.save(user);
		
	}

	
	
}
