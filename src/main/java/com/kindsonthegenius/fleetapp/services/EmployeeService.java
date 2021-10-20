package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Employee;
import com.kindsonthegenius.fleetapp.repositories.EmployeeRepository;
import com.kindsonthegenius.fleetapp.repositories.UserRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private UserRepository userRepository;

	// return la liste des countries
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	// save new employee
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	// get employee by id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}

	// Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}

	// Get Employee by username
	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}
}
