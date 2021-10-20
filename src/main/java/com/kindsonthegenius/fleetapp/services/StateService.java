package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	// return la liste des countries
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	// save new state
	public void save(State state) {
		stateRepository.save(state);
	}

	// get state by id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}

	// Delete State
	public void delete(int id) {
		stateRepository.deleteById(id);
	}
}
