package com.user.manegiment.basis.controller;

import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.manegiment.basis.service.UserService;

@Controller
@RequestMapping("/user")
public class SignupController {

	@Autowired
	private UserService service;

	@GetMapping("/signup")
	public String getSignup(Model model, Locale locale) {

		Map<String, Integer> genderMap = service.getGenderMap(locale);
		model.addAttribute("genderMap", genderMap);
		return "user/signup";

	}

	@PostMapping("/signup")
	public String postSignup() {
		return "redirect:/login";
	}
}
