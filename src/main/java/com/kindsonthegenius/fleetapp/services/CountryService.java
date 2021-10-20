package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	// return la liste des countries
	public List<Country> getCountries() {
		return countryRepository.findAll();
	}

	// save new country
	public void save(Country country) {
		countryRepository.save(country);
	}

	// get country by id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

	// Delete Country
	public void delete(int id) {
		countryRepository.deleteById(id);
	}
}
