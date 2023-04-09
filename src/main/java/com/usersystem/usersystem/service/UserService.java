/**
 * 
 */
package com.usersystem.usersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.usersystem.usersystem.model.UserEntity;
import com.usersystem.usersystem.repository.UserRepository;

/**
 * @author NEERAJ
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncode;
	
	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
		
	}

	

	public UserEntity createUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userEntity.setPassword( new BCryptPasswordEncoder().encode(userEntity.getPassword()));
//		userEntity.setRole("ROLE_USER");

		return userRepository.save(userEntity);
	}



	public UserEntity findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}
	
	
}
