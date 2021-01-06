package com.yazilimbilimi.springexceptionhandling.controller;

import com.yazilimbilimi.springexceptionhandling.domain.Employee;
import com.yazilimbilimi.springexceptionhandling.dto.CreateEmployeeDto;
import com.yazilimbilimi.springexceptionhandling.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add")
    public ResponseEntity<Employee> add(@RequestBody CreateEmployeeDto createEmployeeDto) {
        Employee employee = employeeService.add(createEmployeeDto);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
