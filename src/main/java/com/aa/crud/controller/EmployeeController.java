package com.aa.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aa.crud.entity.Employee;
import com.aa.crud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	@GetMapping("/employee/{id}")
	public Employee findByProductId(@PathVariable int id) {
		System.out.println("This is test");
		return employeeService.findByEmployeeId(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> findProducts() {
		return employeeService.findAll();
	}
	
	@PostMapping("/addEmployee")
	public Employee addProduct(@RequestBody Employee product) {
		return employeeService.saveEmployee(product);
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addProducts(@RequestBody List<Employee> products) {
		return employeeService.saveEmployees(products);
	}
	
	@PutMapping("/updateEmployee")
    public Employee updateProduct(@RequestBody Employee product) {
        return employeeService.updateEmployee(product);
    }
	
	@DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }

}

