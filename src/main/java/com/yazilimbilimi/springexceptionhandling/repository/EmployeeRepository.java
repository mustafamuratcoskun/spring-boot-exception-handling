package com.yazilimbilimi.springexceptionhandling.repository;

import com.yazilimbilimi.springexceptionhandling.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
