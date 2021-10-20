package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Supplier;
import com.kindsonthegenius.fleetapp.repositories.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	// return la liste des countries
	public List<Supplier> getSuppliers() {
		return supplierRepository.findAll();
	}

	// save new supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}

	// get supplier by id
	public Optional<Supplier> findById(int id) {
		return supplierRepository.findById(id);
	}

	// Delete Supplier
	public void delete(int id) {
		supplierRepository.deleteById(id);
	}
}
