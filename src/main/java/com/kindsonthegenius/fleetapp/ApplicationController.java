package com.kindsonthegenius.fleetapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kindsonthegenius.fleetapp.controllers.ClientController;

@Controller
public class ApplicationController {
	@Autowired
	private ClientController clientController;

	@GetMapping("/index")
	public String goHome(Model model) {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
