package com.kindsonthegenius.fleetapp.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindsonthegenius.fleetapp.services.EmployeeService;

@Controller
public class ProfileController {

	@Autowired
	private EmployeeService employeerService;

	@RequestMapping(value = "/profile")
	public String Profile(Model model, Principal principal) {
		String un = principal.getName();
		model.addAttribute("employee", employeerService.findByUsername(un));
		return "profile";
	}
}
