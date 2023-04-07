/**
 * 
 */
package com.usersystem.usersystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
//@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/signin")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/health-check")
	public Boolean healthcheck() {
		return true;
	}

	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserEntity userEntity) {

		 System.out.println(userEntity);

//		boolean f = userService.checkEmail(user.getEmail());
//
//		if (f) {
//			session.setAttribute("msg", "Email Id alreday exists");
//		}
//
//		else {
			UserEntity response = userService.createUser(userEntity);
			if (response != null) {
				 System.out.println("Register Sucessfully");
			} else {
				 System.out.println("Something wrong on server");

			}
//		}

		return "redirect:/register";
	}
}
