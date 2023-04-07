/**
 * 
 */
package com.usersystem.usersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
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
	
//	public boolean existsByEmail(String email) {
//		return userRepository.existsByEmail(email);
//	}
//
//	public UserEntity findByEmail(String email) {
//		return userRepository.findByEmail(email);
//	}

	public UserEntity createUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userEntity.setPassword((userEntity.getPassword()));
		userEntity.setRole("ROLE_USER");

		return userRepository.save(userEntity);
	}
	
	
}
