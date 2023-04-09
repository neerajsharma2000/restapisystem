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

	public boolean existsByEmail(String email) {
		// checks whether the user email exists in db
		return userRepository.existsByEmail(email);

	}

	public UserEntity createUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		// encode password for security purpose
		userEntity.setPassword(new BCryptPasswordEncoder().encode(userEntity.getPassword()));

		return userRepository.save(userEntity);
	}

	public UserEntity findByEmail(String email) {
		// TODO Auto-generated method stub
		// return the user with specified email  from db

		return userRepository.findByEmail(email);
	}

}
