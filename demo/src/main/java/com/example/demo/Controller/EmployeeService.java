package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmpployeeRepository repo;

	public List<Employee> findAllEMP() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}
}
