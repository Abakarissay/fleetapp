package com.kindsonthegenius.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.InvoiceStatus;
import com.kindsonthegenius.fleetapp.services.InvoiceStatusService;

@Controller
public class InvoiceStatusController {

	@Autowired
	private InvoiceStatusService invoiceStatusService;

	// Get All InvoiceStatuss
	@GetMapping("/invoicesStatus")
	public String findAll(Model model) {
		List<InvoiceStatus> invoiceList = invoiceStatusService.getInvoiceStatuses();
		model.addAttribute("invoicesStatus", invoiceList);
		return "InvoiceStatus";
	}

	@RequestMapping("invoicesStatus/findById")
	@ResponseBody
	public Optional<InvoiceStatus> findById(Integer id) {
		return invoiceStatusService.findById(id);
	}

	// Add InvoiceStatus
	@PostMapping(value = "/invoicesStatus/addNew")
	public String addNew(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoicesStatus";
	}

	@RequestMapping(value = "/invoicesStatus/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoicesStatus";
	}

	@RequestMapping(value = "/invoicesStatus/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		invoiceStatusService.delete(id);
		return "redirect:/invoicesStatus";
	}
}
