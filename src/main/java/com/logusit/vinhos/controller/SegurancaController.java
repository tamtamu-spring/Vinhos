package com.logusit.vinhos.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SegurancaController {

	@RequestMapping("/")
	public String principal() {
		return "redirect:/login";
	}

	@RequestMapping("/login")
	public String login(@AuthenticationPrincipal User user) {
		System.out.println(">>> " + user);
		if (user != null) {
			return "redirect:/vinhos";
		}

		return "login";
	}

}