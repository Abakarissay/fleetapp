package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Client;
import com.kindsonthegenius.fleetapp.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	// return la liste des countries
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	public Long countClients() {
		return clientRepository.count();
	}

	// save new client
	public void save(Client client) {
		clientRepository.save(client);
	}

	// get client by id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}

	// Delete Client
	public void delete(int id) {
		clientRepository.deleteById(id);
	}
}
