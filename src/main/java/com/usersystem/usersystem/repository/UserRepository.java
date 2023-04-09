/**
 * 
 */
package com.usersystem.usersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usersystem.usersystem.model.UserEntity;

/**
 * @author NEERAJ
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {


	boolean existsByEmail(String email);
	
	public UserEntity findByEmail(String email);



	

}
