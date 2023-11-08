package com.testManagement.service;

import com.testManagement.exception.InvalidCredentialException;
import com.testManagement.exception.NotFoundException;
import com.testManagement.model.Users;


public interface UsersService{

	public Users login(String email, String password) throws InvalidCredentialException, NotFoundException;
	
	public Users signUp(Users user);
	
	
}
