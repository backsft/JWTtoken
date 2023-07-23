package com.JWTTest.MyServices;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.JWTTest.MyEntities.Users;
import com.JWTTest.MyRepository.UserRepo;

@Service
public class UserService {
	
	@Autowired 
	UserRepo userRepo;
	@Autowired
	PasswordEncoder passwordEncoder;

	public List<Users> getUsers(){
		
		return userRepo.findAll();
	}
	
	public Users createUser(Users user) {
		
		
		user.setUserId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	
	

}
