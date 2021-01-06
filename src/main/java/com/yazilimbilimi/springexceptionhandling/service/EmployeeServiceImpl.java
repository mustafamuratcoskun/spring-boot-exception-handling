package com.yazilimbilimi.springexceptionhandling.service;

import com.yazilimbilimi.springexceptionhandling.domain.Employee;
import com.yazilimbilimi.springexceptionhandling.exceptions.EntityNotFoundException;
import com.yazilimbilimi.springexceptionhandling.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee findById(int productId) {
        Employee employee =  employeeRepository.findById(productId)
               .orElseThrow(() -> new EntityNotFoundException("Employee Not Found with id : " + productId));
        return employee;
    }

}