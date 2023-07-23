package com.JWTTest.MyRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JWTTest.MyEntities.Users;


public interface UserRepo extends JpaRepository<Users, String>{
	
	Optional<Users> findByEmail(String email);

}
