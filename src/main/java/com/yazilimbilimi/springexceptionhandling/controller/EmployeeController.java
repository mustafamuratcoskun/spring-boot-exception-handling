package com.yazilimbilimi.springexceptionhandling.controller;

import com.yazilimbilimi.springexceptionhandling.domain.Employee;
import com.yazilimbilimi.springexceptionhandling.dto.CreateEmployeeDto;
import com.yazilimbilimi.springexceptionhandling.service.EmployeeService;
import com.yazilimbilimi.springexceptionhandling.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("employeeId") int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody CreateEmployeeDto createEmployeeDto) {
        Employee employee = employeeService.add(createEmployeeDto);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
