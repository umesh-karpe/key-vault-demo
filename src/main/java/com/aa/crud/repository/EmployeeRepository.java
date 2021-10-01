package com.aa.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
