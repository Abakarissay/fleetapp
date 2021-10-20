package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Invoice;
import com.kindsonthegenius.fleetapp.repositories.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	// return la liste des countries
	public List<Invoice> getInvoices() {
		return invoiceRepository.findAll();
	}

	// save new invoice
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	// get invoice by id
	public Optional<Invoice> findById(int id) {
		return invoiceRepository.findById(id);
	}

	// Delete Invoice
	public void delete(int id) {
		invoiceRepository.deleteById(id);
	}
}
