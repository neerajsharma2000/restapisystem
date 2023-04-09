package com.usersystem.usersystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.usersystem.usersystem.model.UserEntity;
import com.usersystem.usersystem.repository.UserRepository;
/**
 * @author NEERAJ
 *
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		UserEntity user = userRepository.findByEmail(email);

		if (user != null) {
			return new CustomUserDetails(user);
		}

		throw new UsernameNotFoundException("user not available");
	}
}
