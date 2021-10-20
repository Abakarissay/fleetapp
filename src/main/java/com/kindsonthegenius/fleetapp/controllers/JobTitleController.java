package com.kindsonthegenius.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.JobTitle;
import com.kindsonthegenius.fleetapp.services.JobTitleService;

@Controller
public class JobTitleController {

	@Autowired
	private JobTitleService jobTitleService;

	// Get All JobTitles
	@GetMapping("jobtitles")
	public String findAll(Model model) {
		model.addAttribute("jobtitles", jobTitleService.getJobTitles());
		return "JobTitle";
	}

	@RequestMapping("jobtitles/findById")
	@ResponseBody
	public Optional<JobTitle> findById(Integer id) {
		return jobTitleService.findById(id);
	}

	// Add JobTitle
	@PostMapping(value = "jobtitles/addNew")
	public String addNew(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobtitles";
	}

	@RequestMapping(value = "jobtitles/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobtitles";
	}

	@RequestMapping(value = "jobtitles/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		jobTitleService.delete(id);
		return "redirect:/jobtitles";
	}
}
