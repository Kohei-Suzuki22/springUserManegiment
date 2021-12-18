package com.user.manegiment.basis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LogoutController {

	@PostMapping("/logout")
	public String postLogout() {
		log.info("logout");
		return "redirect:/login";
	}
}
