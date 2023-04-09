/**
 * 
 */
package com.usersystem.usersystem.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usersystem.usersystem.model.UserEntity;
import com.usersystem.usersystem.service.UserService;

/**
 * @author NEERAJ
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String home() {
		return "user/home";
	}

	

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		UserEntity user = userService.findByEmail(email);

		m.addAttribute("user", user);

	}
	

	@GetMapping("/health-check")
	public Boolean healthcheck() {
		return true;
	}

}
