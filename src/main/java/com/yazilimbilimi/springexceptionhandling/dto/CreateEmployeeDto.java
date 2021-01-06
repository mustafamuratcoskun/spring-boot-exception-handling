package com.yazilimbilimi.springexceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeDto {
    private String firstName;
    private String lastName;
    private Integer salary;
}
