/**
 * 
 */
package com.usersystem.usersystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NEERAJ
 *
 */
@RestController
@RequestMapping("/home")
public class HomeController {
//	@Autowired
//	private UserService userService;

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

//	@PostMapping("/createUser")
//	public String createuser(@ModelAttribute UserDtls user, HttpSession session) {
//
//		// System.out.println(user);
//
//		boolean f = userService.checkEmail(user.getEmail());
//
//		if (f) {
//			session.setAttribute("msg", "Email Id alreday exists");
//		}
//
//		else {
//			UserDtls userDtls = userService.createUser(user);
//			if (userDtls != null) {
//				session.setAttribute("msg", "Register Sucessfully");
//			} else {
//				session.setAttribute("msg", "Something wrong on server");
//			}
//		}
//
//		return "redirect:/register";
	}



