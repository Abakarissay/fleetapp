package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.JobTitle;
import com.kindsonthegenius.fleetapp.repositories.JobTitleRepository;

@Service
public class JobTitleService {

	@Autowired
	private JobTitleRepository jobTitleRepository;

	// return la liste of the jobTitle
	public List<JobTitle> getJobTitles() {
		return jobTitleRepository.findAll();
	}

	// save new jobTitle
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}

	// get jobTitle by id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
	}

	// Delete JobTitle
	public void delete(int id) {
		jobTitleRepository.deleteById(id);
	}
}
