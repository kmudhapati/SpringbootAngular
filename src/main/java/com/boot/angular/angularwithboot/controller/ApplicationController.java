package com.boot.angular.angularwithboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import veni.com.domain.Employee;
import veni.com.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class ApplicationController {
	
	@Autowired
    public EmployeeService employeeService;

	@GetMapping
	public ResponseEntity<List<Employee>> appName() {
		return new ResponseEntity<List<Employee>>(employeeService.getEmplyeeList(), HttpStatus.OK);
	}
	
	//@PutMapping(name = "/workdays")
	@RequestMapping(value = "/workdays", method = RequestMethod.PUT)
	public ResponseEntity<List<Employee>> updateWorkDays(@RequestBody Employee emp) {
		try {
			
			 employeeService.updateWorkDays(emp);
			
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Employee>>(employeeService.getEmplyeeList(), HttpStatus.OK);
	}
	@RequestMapping(value = "/pto", method = RequestMethod.PUT)
	public ResponseEntity<List<Employee>> updatePTO(@RequestBody Employee emp) {
		try {
			
				employeeService.updatePTO(emp);
			
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Employee>>(employeeService.getEmplyeeList(), HttpStatus.OK);
	}

}
