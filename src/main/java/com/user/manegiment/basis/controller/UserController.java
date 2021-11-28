package com.user.manegiment.basis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.manegiment.basis.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/signup")
	public String getSignup(Model model) {
		
		Map<String,Integer> gender = service.getGenderMap();
		model.addAttribute("gender", gender);
		return "/user/signup";
		
	}
	
}
