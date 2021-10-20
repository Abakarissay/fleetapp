package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Location;
import com.kindsonthegenius.fleetapp.repositories.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;

	// return liste of the location
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	// save new location
	public void save(Location location) {
		locationRepository.save(location);
	}

	// get location by id
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
	}

	// Delete Location
	public void delete(int id) {
		locationRepository.deleteById(id);
	}
}
