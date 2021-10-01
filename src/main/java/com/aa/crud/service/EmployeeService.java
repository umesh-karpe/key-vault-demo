package com.aa.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aa.crud.entity.Employee;
import com.aa.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> findAll() {
		return repository.findAll();
	}
	
	public Employee findByEmployeeId(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employee) {
		return repository.saveAll(employee);
	}
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Product Deleted with ID :"+id;
	}
	
	public Employee updateEmployee(Employee employee) {
		
		Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setDesignation(employee.getDesignation());
		existingEmployee.setEmail(employee.getDesignation());
		existingEmployee.setReportingManager(employee.getReportingManager());
		
		return repository.save(existingEmployee);
	}
}
