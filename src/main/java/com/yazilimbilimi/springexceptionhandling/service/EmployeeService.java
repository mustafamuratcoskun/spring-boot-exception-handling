package com.yazilimbilimi.springexceptionhandling.service;

import com.yazilimbilimi.springexceptionhandling.domain.Employee;
import com.yazilimbilimi.springexceptionhandling.dto.CreateEmployeeDto;

public interface EmployeeService {

    Employee findById(int employeeId);

    Employee add(CreateEmployeeDto createEmployeeDto);


}
