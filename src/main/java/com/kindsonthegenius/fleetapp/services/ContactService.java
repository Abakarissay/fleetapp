package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Contact;
import com.kindsonthegenius.fleetapp.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	// return la liste des countries
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}

	// save new contact
	public void save(Contact contact) {
		contactRepository.save(contact);
	}

	// get contact by id
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}

	// Delete Contact
	public void delete(int id) {
		contactRepository.deleteById(id);
	}
}
